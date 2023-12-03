package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.Logger;
import com.google.firebase.database.logging.Logger;
import java.util.List;
import sc.e;
/* loaded from: classes.dex */
public class DatabaseConfig extends Context {

    /* renamed from: com.google.firebase.database.core.DatabaseConfig$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$database$Logger$Level;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            $SwitchMap$com$google$firebase$database$Logger$Level = iArr;
            try {
                iArr[Logger.Level.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$database$Logger$Level[Logger.Level.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$database$Logger$Level[Logger.Level.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firebase$database$Logger$Level[Logger.Level.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firebase$database$Logger$Level[Logger.Level.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public void setAppCheckTokenProvider(TokenProvider tokenProvider) {
        this.appCheckTokenProvider = tokenProvider;
    }

    public void setAuthTokenProvider(TokenProvider tokenProvider) {
        this.authTokenProvider = tokenProvider;
    }

    public synchronized void setDebugLogComponents(List<String> list) {
        assertUnfrozen();
        setLogLevel(Logger.Level.DEBUG);
        this.loggedComponents = list;
    }

    public synchronized void setEventTarget(EventTarget eventTarget) {
        assertUnfrozen();
        this.eventTarget = eventTarget;
    }

    public synchronized void setFirebaseApp(e eVar) {
        this.firebaseApp = eVar;
    }

    public synchronized void setLogLevel(Logger.Level level) {
        assertUnfrozen();
        int i6 = AnonymousClass1.$SwitchMap$com$google$firebase$database$Logger$Level[level.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 == 5) {
                            this.logLevel = Logger.Level.NONE;
                        } else {
                            throw new IllegalArgumentException("Unknown log level: " + level);
                        }
                    } else {
                        this.logLevel = Logger.Level.ERROR;
                    }
                } else {
                    this.logLevel = Logger.Level.WARN;
                }
            } else {
                this.logLevel = Logger.Level.INFO;
            }
        } else {
            this.logLevel = Logger.Level.DEBUG;
        }
    }

    public synchronized void setLogger(com.google.firebase.database.logging.Logger logger) {
        assertUnfrozen();
        this.logger = logger;
    }

    public synchronized void setPersistenceCacheSizeBytes(long j10) {
        assertUnfrozen();
        if (j10 >= 1048576) {
            if (j10 <= 104857600) {
                this.cacheSize = j10;
            } else {
                throw new DatabaseException("Firebase Database currently doesn't support a cache size larger than 100MB");
            }
        } else {
            throw new DatabaseException("The minimum cache size must be at least 1MB");
        }
    }

    public synchronized void setPersistenceEnabled(boolean z10) {
        assertUnfrozen();
        this.persistenceEnabled = z10;
    }

    public void setRunLoop(RunLoop runLoop) {
        this.runLoop = runLoop;
    }

    public synchronized void setSessionPersistenceKey(String str) {
        assertUnfrozen();
        if (str != null && !str.isEmpty()) {
            this.persistenceKey = str;
        } else {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
    }
}
