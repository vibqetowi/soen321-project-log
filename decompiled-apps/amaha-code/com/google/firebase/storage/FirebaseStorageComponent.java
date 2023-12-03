package com.google.firebase.storage;

import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FirebaseStorageComponent {
    private final sc.e app;
    private final re.b<cd.b> appCheckProvider;
    private final re.b<gd.b> authProvider;
    private final Map<String, FirebaseStorage> instances = new HashMap();

    public FirebaseStorageComponent(sc.e eVar, re.b<gd.b> bVar, re.b<cd.b> bVar2) {
        this.app = eVar;
        this.authProvider = bVar;
        this.appCheckProvider = bVar2;
    }

    public synchronized void clearInstancesForTesting() {
        this.instances.clear();
    }

    public synchronized FirebaseStorage get(String str) {
        FirebaseStorage firebaseStorage;
        firebaseStorage = this.instances.get(str);
        if (firebaseStorage == null) {
            firebaseStorage = new FirebaseStorage(str, this.app, this.authProvider, this.appCheckProvider);
            this.instances.put(str, firebaseStorage);
        }
        return firebaseStorage;
    }
}
