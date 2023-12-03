package o0;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f26896a;

    public j(Object obj) {
        this.f26896a = (LocaleList) obj;
    }

    @Override // o0.i
    public final String a() {
        String languageTags;
        languageTags = this.f26896a.toLanguageTags();
        return languageTags;
    }

    @Override // o0.i
    public final Object b() {
        return this.f26896a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f26896a.equals(((i) obj).b());
        return equals;
    }

    @Override // o0.i
    public final Locale get(int i6) {
        Locale locale;
        locale = this.f26896a.get(i6);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f26896a.hashCode();
        return hashCode;
    }

    @Override // o0.i
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f26896a.isEmpty();
        return isEmpty;
    }

    @Override // o0.i
    public final int size() {
        int size;
        size = this.f26896a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f26896a.toString();
        return localeList;
    }
}
