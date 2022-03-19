package com.thuggeelya.app.services;

import com.googlecode.fannj.*;
import com.thuggeelya.web.dto.Capsule;
import com.thuggeelya.web.dto.Input;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QuestionnaireService {

    static final Integer QUESTIONS_NUMBER = 5;
    static final Integer PERSONAL_CAPSULES_NUMBER = 1;
    static final Integer CAPSULES_NUMBER = 5;

    public QuestionnaireService() {}

    public Capsule generateCapsule(Input input) {
        return new Capsule();
    }

    public void ANNTraining() {
        List<Layer> layerList = new ArrayList<>();
        // input
        layerList.add(Layer.create(QUESTIONS_NUMBER, ActivationFunction.FANN_SIGMOID_SYMMETRIC, 0.01f));
        // hidden
        layerList.add(Layer.create(16, ActivationFunction.FANN_SIGMOID_SYMMETRIC, 0.01f));
        // output
        layerList.add(Layer.create(PERSONAL_CAPSULES_NUMBER, ActivationFunction.FANN_SIGMOID_SYMMETRIC, 0.01f));
        Fann fann = new Fann(layerList);
        Trainer trainer = new Trainer(fann);
        trainer.setTrainingAlgorithm(TrainingAlgorithm.FANN_TRAIN_RPROP);
        trainer.train(new File("train.txt").getAbsolutePath(), 100000, 100, 0.0001f);
        fann.save("ann");
    }

    public String ANNTesting() {
        Fann fann = new Fann("ann");
        float[][] tests = {
                {2, 1, 1, 2, 3}
        };
        String results = "";

        for (float[] test : tests) {
            results = results.concat(Arrays.toString(test))
                             .concat(getAction(fann.run(test)).toString())
                             .concat(System.lineSeparator());
        }

        return results;
    }

    @NotNull
    @Contract(pure = true)
    private static Capsule getAction(float[] out){
        int i = 0;
        for (int j = 1; j < CAPSULES_NUMBER; j++) {
            if(out[i]<out[j]){
                i = j;
            }
        }
        switch (i){
            case 0:return new Capsule();
            case 1:return new Capsule();
        }
        return new Capsule();
    }
}
