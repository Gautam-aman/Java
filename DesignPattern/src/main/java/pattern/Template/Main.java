package pattern.Template;

abstract class TrainModel{

    protected void loadData(){
        System.out.println("Loading Data");
    }

    protected void PreprocessData(){
        System.out.println("Preprocessing Data");
    }

    protected void SaveModel(){
        System.out.println("Saving Data");
    }

    public abstract void trainModel();
    public abstract void evaluateModel();

    public void TrainPipeLine(){
        loadData();
        PreprocessData();
        trainModel();
        evaluateModel();
        SaveModel();
    }
}


class TrainModelFromPython extends TrainModel{

    @Override
    public void trainModel() {
        System.out.println("Training Model from Python");
    }

    @Override
    public void evaluateModel() {
        System.out.println("Evaluating Model from Python");
    }
}

public class Main {
    public static void main(String[] args) {

        TrainModelFromPython model = new TrainModelFromPython();
        model.TrainPipeLine();

    }
}
