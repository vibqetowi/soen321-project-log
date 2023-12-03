package com.bugsnag.android;

import com.bugsnag.android.internal.TaskType;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
class LibraryLoader {
    private final AtomicBoolean attemptedLoad = new AtomicBoolean();
    private boolean loaded = false;

    public boolean isLoaded() {
        return this.loaded;
    }

    public void loadLibInternal(String str, Client client, OnErrorCallback onErrorCallback) {
        if (!this.attemptedLoad.getAndSet(true)) {
            try {
                System.loadLibrary(str);
                this.loaded = true;
            } catch (UnsatisfiedLinkError e10) {
                client.notify(e10, onErrorCallback);
            }
        }
    }

    public boolean loadLibrary(final String str, final Client client, final OnErrorCallback onErrorCallback) {
        try {
            client.bgTaskService.submitTask(TaskType.IO, new Runnable() { // from class: com.bugsnag.android.LibraryLoader.1
                @Override // java.lang.Runnable
                public void run() {
                    LibraryLoader.this.loadLibInternal(str, client, onErrorCallback);
                }
            }).get();
            return this.loaded;
        } catch (Throwable unused) {
            return false;
        }
    }
}
