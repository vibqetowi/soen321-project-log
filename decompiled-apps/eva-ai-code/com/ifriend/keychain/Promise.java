package com.ifriend.keychain;
/* loaded from: classes6.dex */
interface Promise<T> {
    @Deprecated
    void reject(String str);

    void reject(String str, String str2);

    void reject(String str, String str2, Throwable th);

    void reject(String str, Throwable th);

    void reject(Throwable th);

    void resolve(T t);
}
