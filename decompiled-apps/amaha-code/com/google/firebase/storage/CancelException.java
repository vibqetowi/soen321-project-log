package com.google.firebase.storage;

import java.io.IOException;
/* loaded from: classes.dex */
class CancelException extends IOException {
    public CancelException() {
        super("The operation was canceled.");
    }
}
