package com.jetbrains;

public class main {

    public static void main(String[] args)
    {
        Monitor Acer = new Monitor("CB241H", 1920, 1080,
                60, 1, false, PanelTechnology.IPS);
        Monitor Dell = new Monitor("FV280", 600, 400,
                60, 2, true, PanelTechnology.TN);
        Acer.ShowCharacteristicsOfMonitor();

        if(Acer.xResolution > Dell.xResolution && Acer.yResolution > Dell.yResolution)
        {
            System.out.println("Acer" + Acer.modelName + " is Better than" + Dell.modelName);
        }
        else
        {
            System.out.println("Dell" + Dell.modelName + " is Better than " + Acer.modelName);
        }
    }
}
