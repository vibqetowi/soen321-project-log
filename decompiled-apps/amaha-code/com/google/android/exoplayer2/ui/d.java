package com.google.android.exoplayer2.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: SpannedToHtmlConverter.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f7126a = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f7127a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, String> f7128b;

        public a(String str, Map map) {
            this.f7127a = str;
            this.f7128b = map;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final p0.d f7129e = new p0.d(12);
        public static final p0.d f = new p0.d(13);

        /* renamed from: a  reason: collision with root package name */
        public final int f7130a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7131b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7132c;

        /* renamed from: d  reason: collision with root package name */
        public final String f7133d;

        public b(int i6, int i10, String str, String str2) {
            this.f7130a = i6;
            this.f7131b = i10;
            this.f7132c = str;
            this.f7133d = str2;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f7134a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f7135b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return f7126a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
