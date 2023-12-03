package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.JsonStream.Streamable;
import gv.a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.i;
import ss.l;
/* compiled from: SynchronizedStreamableStore.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/SynchronizedStreamableStore;", "Lcom/bugsnag/android/JsonStream$Streamable;", "T", "", "streamable", "Lhs/k;", "persist", "(Lcom/bugsnag/android/JsonStream$Streamable;)V", "Lkotlin/Function1;", "Landroid/util/JsonReader;", "loadCallback", "load", "(Lss/l;)Lcom/bugsnag/android/JsonStream$Streamable;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/io/File;", "file", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class SynchronizedStreamableStore<T extends JsonStream.Streamable> {
    private final File file;
    private final ReentrantReadWriteLock lock;

    public SynchronizedStreamableStore(File file) {
        i.h(file, "file");
        this.file = file;
        this.lock = new ReentrantReadWriteLock();
    }

    public final T load(l<? super JsonReader, ? extends T> loadCallback) {
        BufferedReader bufferedReader;
        i.h(loadCallback, "loadCallback");
        ReentrantReadWriteLock.ReadLock readLock = this.lock.readLock();
        i.c(readLock, "lock.readLock()");
        readLock.lock();
        try {
            File file = this.file;
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), a.f16927b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            T invoke = loadCallback.invoke(new JsonReader(bufferedReader));
            ca.a.z(bufferedReader, null);
            return invoke;
        } finally {
            readLock.unlock();
        }
    }

    public final void persist(T streamable) {
        BufferedWriter bufferedWriter;
        i.h(streamable, "streamable");
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        i.c(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            File file = this.file;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), a.f16927b);
            if (outputStreamWriter instanceof BufferedWriter) {
                bufferedWriter = (BufferedWriter) outputStreamWriter;
            } else {
                bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
            }
            streamable.toStream(new JsonStream(bufferedWriter));
            ca.a.z(bufferedWriter, null);
        } finally {
            writeLock.unlock();
        }
    }
}
