package com.jetbrains;

enum PanelTechnology
{
    TN, IPS, VA
}

public class Monitor {

    public String modelName;

    public int xResolution;
    public int yResolution;
    public int refreshRate;

    public float responseTime;

    public boolean isCurved;

    public PanelTechnology panelTechnology;

    Monitor(String modelName, int xResolution, int yResolution,
            int refreshRate, float responseTime, boolean isCurved,
            PanelTechnology panelTechnology)
    {
        this.modelName = modelName;
        this.xResolution = xResolution;
        this.yResolution = yResolution;
        this.refreshRate = refreshRate;
        this.responseTime = responseTime;
        this.isCurved = isCurved;
        this.panelTechnology = panelTechnology;
    }

    public void ShowCharacteristicsOfMonitor()
    {
        System.out.println("Model : " + this.modelName + "\n");
        System.out.println("Resolution : " + this.xResolution + " X " + this.yResolution + "px\n");
        System.out.println("Refresh Rate : " + this.refreshRate + "HZ\n");
        System.out.println("Response Time:" + this.responseTime + "ms\n");
        if(isCurved)
        {
            System.out.println("Is Curved/n");
        }
        System.out.println("Panel Technology:" + this.panelTechnology);
    }
}
