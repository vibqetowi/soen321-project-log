package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import java.io.File;
import java.io.FileInputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FileInputStreamInitData {
    final FileInputStream delegate;
    final File file;
    final boolean isSendDefaultPii;
    final ISpan span;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileInputStreamInitData(File file, ISpan iSpan, FileInputStream fileInputStream, boolean z) {
        this.file = file;
        this.span = iSpan;
        this.delegate = fileInputStream;
        this.isSendDefaultPii = z;
    }
}
