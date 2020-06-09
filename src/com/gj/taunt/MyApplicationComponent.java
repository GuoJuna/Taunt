package com.gj.taunt;

import com.intellij.openapi.components.ApplicationComponent;

public class MyApplicationComponent implements ApplicationComponent {

    @Override
    public void initComponent() {
        TauntDialog tauntDialog = new TauntDialog();
        tauntDialog.show();
    }


}
