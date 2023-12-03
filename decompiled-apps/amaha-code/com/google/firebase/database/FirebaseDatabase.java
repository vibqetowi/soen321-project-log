package com.google.firebase.database;

import android.text.TextUtils;
import com.google.firebase.database.Logger;
import com.google.firebase.database.annotations.Nullable;
import com.google.firebase.database.core.DatabaseConfig;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.Repo;
import com.google.firebase.database.core.RepoInfo;
import com.google.firebase.database.core.RepoManager;
import com.google.firebase.database.core.utilities.ParsedUrl;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.utilities.Validation;
import r1.b0;
import sc.e;
import sc.f;
import v9.o;
import zd.a;
/* loaded from: classes.dex */
public class FirebaseDatabase {
    private static final String SDK_VERSION = "20.1.0";
    private final e app;
    private final DatabaseConfig config;
    @Nullable
    private a emulatorSettings;
    private Repo repo;
    private final RepoInfo repoInfo;

    public FirebaseDatabase(e eVar, RepoInfo repoInfo, DatabaseConfig databaseConfig) {
        this.app = eVar;
        this.repoInfo = repoInfo;
        this.config = databaseConfig;
    }

    private void assertUnfrozen(String str) {
        if (this.repo == null) {
            return;
        }
        throw new DatabaseException(b.m("Calls to ", str, "() must be made before any other usage of FirebaseDatabase instance."));
    }

    public static FirebaseDatabase createForTests(e eVar, RepoInfo repoInfo, DatabaseConfig databaseConfig) {
        FirebaseDatabase firebaseDatabase = new FirebaseDatabase(eVar, repoInfo, databaseConfig);
        firebaseDatabase.ensureRepo();
        return firebaseDatabase;
    }

    private synchronized void ensureRepo() {
        if (this.repo == null) {
            this.repoInfo.applyEmulatorSettings(this.emulatorSettings);
            this.repo = RepoManager.createRepo(this.config, this.repoInfo, this);
        }
    }

    public static FirebaseDatabase getInstance() {
        return getInstance(e.e());
    }

    public static String getSdkVersion() {
        return "20.1.0";
    }

    public e getApp() {
        return this.app;
    }

    public DatabaseConfig getConfig() {
        return this.config;
    }

    public DatabaseReference getReference() {
        ensureRepo();
        return new DatabaseReference(this.repo, Path.getEmptyPath());
    }

    public DatabaseReference getReferenceFromUrl(String str) {
        ensureRepo();
        if (str != null) {
            ParsedUrl parseUrl = Utilities.parseUrl(str);
            parseUrl.repoInfo.applyEmulatorSettings(this.emulatorSettings);
            if (parseUrl.repoInfo.host.equals(this.repo.getRepoInfo().host)) {
                return new DatabaseReference(this.repo, parseUrl.path);
            }
            StringBuilder g5 = d.g("Invalid URL (", str, ") passed to getReference().  URL was expected to match configured Database URL: ");
            g5.append(getReference().toString());
            throw new DatabaseException(g5.toString());
        }
        throw new NullPointerException("Can't pass null for argument 'url' in FirebaseDatabase.getReferenceFromUrl()");
    }

    public void goOffline() {
        ensureRepo();
        RepoManager.interrupt(this.repo);
    }

    public void goOnline() {
        ensureRepo();
        RepoManager.resume(this.repo);
    }

    public void purgeOutstandingWrites() {
        ensureRepo();
        this.repo.scheduleNow(new Runnable() { // from class: com.google.firebase.database.FirebaseDatabase.1
            @Override // java.lang.Runnable
            public void run() {
                FirebaseDatabase.this.repo.purgeOutstandingWrites();
            }
        });
    }

    public synchronized void setLogLevel(Logger.Level level) {
        assertUnfrozen("setLogLevel");
        this.config.setLogLevel(level);
    }

    public synchronized void setPersistenceCacheSizeBytes(long j10) {
        assertUnfrozen("setPersistenceCacheSizeBytes");
        this.config.setPersistenceCacheSizeBytes(j10);
    }

    public synchronized void setPersistenceEnabled(boolean z10) {
        assertUnfrozen("setPersistenceEnabled");
        this.config.setPersistenceEnabled(z10);
    }

    public void useEmulator(String str, int i6) {
        if (this.repo == null) {
            this.emulatorSettings = new a(str, i6);
            return;
        }
        throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
    }

    public static FirebaseDatabase getInstance(String str) {
        return getInstance(e.e(), str);
    }

    public DatabaseReference getReference(String str) {
        ensureRepo();
        if (str != null) {
            Validation.validateRootPathString(str);
            return new DatabaseReference(this.repo, new Path(str));
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in FirebaseDatabase.getReference()");
    }

    public static synchronized FirebaseDatabase getInstance(e eVar, String str) {
        FirebaseDatabase firebaseDatabase;
        synchronized (FirebaseDatabase.class) {
            if (TextUtils.isEmpty(str)) {
                throw new DatabaseException("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
            if (eVar != null) {
                FirebaseDatabaseComponent firebaseDatabaseComponent = (FirebaseDatabaseComponent) eVar.c(FirebaseDatabaseComponent.class);
                o.i(firebaseDatabaseComponent, "Firebase Database component is not present.");
                ParsedUrl parseUrl = Utilities.parseUrl(str);
                if (parseUrl.path.isEmpty()) {
                    firebaseDatabase = firebaseDatabaseComponent.get(parseUrl.repoInfo);
                } else {
                    throw new DatabaseException("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + parseUrl.path.toString());
                }
            } else {
                throw new NullPointerException("Provided FirebaseApp must not be null.");
            }
        }
        return firebaseDatabase;
    }

    public static FirebaseDatabase getInstance(e eVar) {
        eVar.b();
        String str = eVar.f31434c.f31446c;
        if (str == null) {
            eVar.b();
            f fVar = eVar.f31434c;
            if (fVar.f31449g != null) {
                StringBuilder sb2 = new StringBuilder("https://");
                eVar.b();
                str = b0.b(sb2, fVar.f31449g, "-default-rtdb.firebaseio.com");
            } else {
                throw new DatabaseException("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
        }
        return getInstance(eVar, str);
    }
}
