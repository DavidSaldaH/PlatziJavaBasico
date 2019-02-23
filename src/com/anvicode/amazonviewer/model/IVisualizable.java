package com.anvicode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {

    Date startTosee(Date dateI);
    void stopToSee(Date dateI, Date dateF);
    
}
