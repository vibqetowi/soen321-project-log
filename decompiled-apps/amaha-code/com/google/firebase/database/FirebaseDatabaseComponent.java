package com.google.firebase.database;

import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.database.core.DatabaseConfig;
import com.google.firebase.database.core.RepoInfo;
import com.google.firebase.database.core.TokenProvider;
import gd.b;
import java.util.HashMap;
import java.util.Map;
import re.a;
import sc.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FirebaseDatabaseComponent {
    private final e app;
    private final TokenProvider appCheckProvider;
    private final TokenProvider authProvider;
    private final Map<RepoInfo, FirebaseDatabase> instances = new HashMap();

    public FirebaseDatabaseComponent(e eVar, a<b> aVar, a<cd.b> aVar2) {
        this.app = eVar;
        this.authProvider = new AndroidAuthTokenProvider(aVar);
        this.appCheckProvider = new AndroidAppCheckTokenProvider(aVar2);
    }

    public synchronized FirebaseDatabase get(RepoInfo repoInfo) {
        FirebaseDatabase firebaseDatabase;
        firebaseDatabase = this.instances.get(repoInfo);
        if (firebaseDatabase == null) {
            DatabaseConfig databaseConfig = new DatabaseConfig();
            e eVar = this.app;
            eVar.b();
            if (!"[DEFAULT]".equals(eVar.f31433b)) {
                e eVar2 = this.app;
                eVar2.b();
                databaseConfig.setSessionPersistenceKey(eVar2.f31433b);
            }
            databaseConfig.setFirebaseApp(this.app);
            databaseConfig.setAuthTokenProvider(this.authProvider);
            databaseConfig.setAppCheckTokenProvider(this.appCheckProvider);
            FirebaseDatabase firebaseDatabase2 = new FirebaseDatabase(this.app, repoInfo, databaseConfig);
            this.instances.put(repoInfo, firebaseDatabase2);
            firebaseDatabase = firebaseDatabase2;
        }
        return firebaseDatabase;
    }
}
