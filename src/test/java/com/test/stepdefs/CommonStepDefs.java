package com.test.stepdefs;

import com.test.apidemo.app.screens.*;
import com.test.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by priyankp.shah on 5/2/16.
 */
public class CommonStepDefs {
    @Autowired
    public AppUtils utils;

    @Autowired
    public AppScreen appScreen;
    @Autowired
    public HomeScreen homeScreen;
    @Autowired
    public ActivityScreen activityScreen;
    @Autowired
    public SecureSurfaceScreen secureSurfaceScreen;
    @Autowired
    public SecureDialogScreen secureDialogScreen;
    @Autowired
    public NotificationScreen notificationScreen;
    @Autowired
    public IncomingMessageNotificationScreen incomingMessageNotificationScreen;
}
