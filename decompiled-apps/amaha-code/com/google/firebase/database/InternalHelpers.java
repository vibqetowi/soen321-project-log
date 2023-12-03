package com.google.firebase.database;

import com.google.firebase.database.core.DatabaseConfig;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.Repo;
import com.google.firebase.database.core.RepoInfo;
import com.google.firebase.database.snapshot.IndexedNode;
import com.google.firebase.database.snapshot.Node;
import sc.e;
/* loaded from: classes.dex */
public class InternalHelpers {
    public static DataSnapshot createDataSnapshot(DatabaseReference databaseReference, IndexedNode indexedNode) {
        return new DataSnapshot(databaseReference, indexedNode);
    }

    public static FirebaseDatabase createDatabaseForTests(e eVar, RepoInfo repoInfo, DatabaseConfig databaseConfig) {
        return FirebaseDatabase.createForTests(eVar, repoInfo, databaseConfig);
    }

    public static MutableData createMutableData(Node node) {
        return new MutableData(node);
    }

    public static DatabaseReference createReference(Repo repo, Path path) {
        return new DatabaseReference(repo, path);
    }
}
