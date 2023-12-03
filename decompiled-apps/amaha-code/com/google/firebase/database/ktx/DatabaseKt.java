package com.google.firebase.database.ktx;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Query;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.flow.d;
import sc.e;
import ta.v;
/* compiled from: Database.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\bH\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u000bH\u0086\b¢\u0006\u0004\b\t\u0010\f\"\u0014\u0010\r\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0012*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"Lxe/a;", "", Constants.NOTIFICATION_URL, "Lcom/google/firebase/database/FirebaseDatabase;", "database", "Lsc/e;", "app", "T", "Lcom/google/firebase/database/DataSnapshot;", "getValue", "(Lcom/google/firebase/database/DataSnapshot;)Ljava/lang/Object;", "Lcom/google/firebase/database/MutableData;", "(Lcom/google/firebase/database/MutableData;)Ljava/lang/Object;", "LIBRARY_NAME", "Ljava/lang/String;", "getDatabase", "(Lxe/a;)Lcom/google/firebase/database/FirebaseDatabase;", "Lcom/google/firebase/database/Query;", "Lkotlinx/coroutines/flow/d;", "getSnapshots", "(Lcom/google/firebase/database/Query;)Lkotlinx/coroutines/flow/d;", "snapshots", "Lcom/google/firebase/database/ktx/ChildEvent;", "getChildEvents", "childEvents", "com.google.firebase-firebase-database-ktx"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DatabaseKt {
    public static final String LIBRARY_NAME = "fire-db-ktx";

    public static final FirebaseDatabase database(xe.a aVar, String url) {
        i.g(aVar, "<this>");
        i.g(url, "url");
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance(url);
        i.f(firebaseDatabase, "getInstance(url)");
        return firebaseDatabase;
    }

    public static final d<ChildEvent> getChildEvents(Query query) {
        i.g(query, "<this>");
        return v.k(new DatabaseKt$childEvents$1(query, null));
    }

    public static final FirebaseDatabase getDatabase(xe.a aVar) {
        i.g(aVar, "<this>");
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        i.f(firebaseDatabase, "getInstance()");
        return firebaseDatabase;
    }

    public static final d<DataSnapshot> getSnapshots(Query query) {
        i.g(query, "<this>");
        return v.k(new DatabaseKt$snapshots$1(query, null));
    }

    public static final <T> T getValue(DataSnapshot dataSnapshot) {
        i.g(dataSnapshot, "<this>");
        i.p();
        throw null;
    }

    public static final FirebaseDatabase database(xe.a aVar, e app) {
        i.g(aVar, "<this>");
        i.g(app, "app");
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance(app);
        i.f(firebaseDatabase, "getInstance(app)");
        return firebaseDatabase;
    }

    public static final <T> T getValue(MutableData mutableData) {
        i.g(mutableData, "<this>");
        i.p();
        throw null;
    }

    public static final FirebaseDatabase database(xe.a aVar, e app, String url) {
        i.g(aVar, "<this>");
        i.g(app, "app");
        i.g(url, "url");
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance(app, url);
        i.f(firebaseDatabase, "getInstance(app, url)");
        return firebaseDatabase;
    }
}
