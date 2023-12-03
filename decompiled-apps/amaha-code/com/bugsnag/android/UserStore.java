package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.StateObserver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: UserStore.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/bugsnag/android/UserStore;", "", "Lcom/bugsnag/android/User;", "user", "", "validUser", "loadPersistedUser", "initialUser", "Lcom/bugsnag/android/UserState;", "load", "Lhs/k;", "save", "Lcom/bugsnag/android/SynchronizedStreamableStore;", "synchronizedStreamableStore", "Lcom/bugsnag/android/SynchronizedStreamableStore;", "persist", "Z", "Ljava/util/concurrent/atomic/AtomicReference;", "previousUser", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/bugsnag/android/internal/ImmutableConfig;", "config", "Lcom/bugsnag/android/internal/ImmutableConfig;", "", "deviceId", "Ljava/lang/String;", "Lcom/bugsnag/android/SharedPrefMigrator;", "sharedPrefMigrator", "Lcom/bugsnag/android/SharedPrefMigrator;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "Ljava/io/File;", "file", "<init>", "(Lcom/bugsnag/android/internal/ImmutableConfig;Ljava/lang/String;Ljava/io/File;Lcom/bugsnag/android/SharedPrefMigrator;Lcom/bugsnag/android/Logger;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class UserStore {
    private final ImmutableConfig config;
    private final String deviceId;
    private final Logger logger;
    private final boolean persist;
    private final AtomicReference<User> previousUser;
    private final SharedPrefMigrator sharedPrefMigrator;
    private final SynchronizedStreamableStore<User> synchronizedStreamableStore;

    public UserStore(ImmutableConfig immutableConfig, String str, SharedPrefMigrator sharedPrefMigrator, Logger logger) {
        this(immutableConfig, str, null, sharedPrefMigrator, logger, 4, null);
    }

    private final User loadPersistedUser() {
        if (this.sharedPrefMigrator.hasPrefs()) {
            User loadUser = this.sharedPrefMigrator.loadUser(this.deviceId);
            save(loadUser);
            return loadUser;
        }
        try {
            return this.synchronizedStreamableStore.load(new UserStore$loadPersistedUser$1(User.Companion));
        } catch (Exception e10) {
            this.logger.w("Failed to load user info", e10);
            return null;
        }
    }

    private final boolean validUser(User user) {
        if (user.getId() == null && user.getName() == null && user.getEmail() == null) {
            return false;
        }
        return true;
    }

    public final UserState load(User initialUser) {
        UserState userState;
        i.h(initialUser, "initialUser");
        if (!validUser(initialUser)) {
            if (this.persist) {
                initialUser = loadPersistedUser();
            } else {
                initialUser = null;
            }
        }
        if (initialUser != null && validUser(initialUser)) {
            userState = new UserState(initialUser);
        } else {
            userState = new UserState(new User(this.deviceId, null, null));
        }
        userState.addObserver(new StateObserver() { // from class: com.bugsnag.android.UserStore$load$1
            @Override // com.bugsnag.android.internal.StateObserver
            public final void onStateChange(StateEvent event) {
                i.h(event, "event");
                if (event instanceof StateEvent.UpdateUser) {
                    UserStore.this.save(((StateEvent.UpdateUser) event).user);
                }
            }
        });
        return userState;
    }

    public final void save(User user) {
        i.h(user, "user");
        if (this.persist && (!i.b(user, this.previousUser.getAndSet(user)))) {
            try {
                this.synchronizedStreamableStore.persist(user);
            } catch (Exception e10) {
                this.logger.w("Failed to persist user info", e10);
            }
        }
    }

    public UserStore(ImmutableConfig config, String str, File file, SharedPrefMigrator sharedPrefMigrator, Logger logger) {
        i.h(config, "config");
        i.h(file, "file");
        i.h(sharedPrefMigrator, "sharedPrefMigrator");
        i.h(logger, "logger");
        this.config = config;
        this.deviceId = str;
        this.sharedPrefMigrator = sharedPrefMigrator;
        this.logger = logger;
        this.persist = config.getPersistUser();
        this.previousUser = new AtomicReference<>(null);
        try {
            file.createNewFile();
        } catch (IOException e10) {
            this.logger.w("Failed to created device ID file", e10);
        }
        this.synchronizedStreamableStore = new SynchronizedStreamableStore<>(file);
    }

    public /* synthetic */ UserStore(ImmutableConfig immutableConfig, String str, File file, SharedPrefMigrator sharedPrefMigrator, Logger logger, int i6, d dVar) {
        this(immutableConfig, str, (i6 & 4) != 0 ? new File(immutableConfig.getPersistenceDirectory().getValue(), "user-info") : file, sharedPrefMigrator, logger);
    }
}
