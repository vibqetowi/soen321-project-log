package com.appsflyer;

import com.appsflyer.internal.cd;
import com.google.firebase.messaging.FirebaseMessagingService;
/* loaded from: classes2.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        new cd(getApplicationContext()).AFInAppEventParameterName(str);
    }
}
