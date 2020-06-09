package com.gj.taunt;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TauntDialog extends DialogWrapper {

    JLabel jlabel;

    protected TauntDialog() {
        super(true);
        setTitle("每天一碗毒鸡汤");
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel jPanel = new JPanel();
        jlabel = new JLabel(ContentUtil.getContent());
        jPanel.add(jlabel);
        return jPanel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("再干一碗");
        jButton.addActionListener(e -> {
            jlabel.setText(ContentUtil.getContent());
        });
        jPanel.add(jButton);
        return jPanel;
    }
}
