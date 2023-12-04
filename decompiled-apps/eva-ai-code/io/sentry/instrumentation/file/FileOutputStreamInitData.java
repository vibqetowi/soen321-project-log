package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import java.io.File;
import java.io.FileOutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FileOutputStreamInitData {
    final boolean append;
    final FileOutputStream delegate;
    final File file;
    final boolean isSendDefaultPii;
    final ISpan span;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileOutputStreamInitData(File file, boolean z, ISpan iSpan, FileOutputStream fileOutputStream, boolean z2) {
        this.file = file;
        this.append = z;
        this.span = iSpan;
        this.delegate = fileOutputStream;
        this.isSendDefaultPii = z2;
    }
}
