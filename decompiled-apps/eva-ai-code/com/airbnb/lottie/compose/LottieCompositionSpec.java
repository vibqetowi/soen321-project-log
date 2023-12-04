package com.airbnb.lottie.compose;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LottieCompositionSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "Asset", "ContentProvider", "File", "JsonString", "RawRes", "Url", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LottieCompositionSpec {

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "resId", "", "constructor-impl", "(I)I", "getResId", "()I", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class RawRes implements LottieCompositionSpec {
        private final int resId;

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ RawRes m6240boximpl(int i) {
            return new RawRes(i);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m6241constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m6242equalsimpl(int i, Object obj) {
            return (obj instanceof RawRes) && i == ((RawRes) obj).m6246unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m6243equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m6244hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m6245toStringimpl(int i) {
            return "RawRes(resId=" + i + ')';
        }

        public boolean equals(Object obj) {
            return m6242equalsimpl(this.resId, obj);
        }

        public int hashCode() {
            return m6244hashCodeimpl(this.resId);
        }

        public String toString() {
            return m6245toStringimpl(this.resId);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m6246unboximpl() {
            return this.resId;
        }

        private /* synthetic */ RawRes(int i) {
            this.resId = i;
        }

        public final int getResId() {
            return this.resId;
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "url", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class Url implements LottieCompositionSpec {
        private final String url;

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Url m6247boximpl(String str) {
            return new Url(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m6248constructorimpl(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return url;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m6249equalsimpl(String str, Object obj) {
            return (obj instanceof Url) && Intrinsics.areEqual(str, ((Url) obj).m6253unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m6250equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m6251hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m6252toStringimpl(String str) {
            return "Url(url=" + str + ')';
        }

        public boolean equals(Object obj) {
            return m6249equalsimpl(this.url, obj);
        }

        public int hashCode() {
            return m6251hashCodeimpl(this.url);
        }

        public String toString() {
            return m6252toStringimpl(this.url);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m6253unboximpl() {
            return this.url;
        }

        private /* synthetic */ Url(String str) {
            this.url = str;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "fileName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class File implements LottieCompositionSpec {
        private final String fileName;

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ File m6226boximpl(String str) {
            return new File(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m6227constructorimpl(String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return fileName;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m6228equalsimpl(String str, Object obj) {
            return (obj instanceof File) && Intrinsics.areEqual(str, ((File) obj).m6232unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m6229equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m6230hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m6231toStringimpl(String str) {
            return "File(fileName=" + str + ')';
        }

        public boolean equals(Object obj) {
            return m6228equalsimpl(this.fileName, obj);
        }

        public int hashCode() {
            return m6230hashCodeimpl(this.fileName);
        }

        public String toString() {
            return m6231toStringimpl(this.fileName);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m6232unboximpl() {
            return this.fileName;
        }

        private /* synthetic */ File(String str) {
            this.fileName = str;
        }

        public final String getFileName() {
            return this.fileName;
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "assetName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class Asset implements LottieCompositionSpec {
        private final String assetName;

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Asset m6212boximpl(String str) {
            return new Asset(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m6213constructorimpl(String assetName) {
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            return assetName;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m6214equalsimpl(String str, Object obj) {
            return (obj instanceof Asset) && Intrinsics.areEqual(str, ((Asset) obj).m6218unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m6215equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m6216hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m6217toStringimpl(String str) {
            return "Asset(assetName=" + str + ')';
        }

        public boolean equals(Object obj) {
            return m6214equalsimpl(this.assetName, obj);
        }

        public int hashCode() {
            return m6216hashCodeimpl(this.assetName);
        }

        public String toString() {
            return m6217toStringimpl(this.assetName);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m6218unboximpl() {
            return this.assetName;
        }

        private /* synthetic */ Asset(String str) {
            this.assetName = str;
        }

        public final String getAssetName() {
            return this.assetName;
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "jsonString", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class JsonString implements LottieCompositionSpec {
        private final String jsonString;

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ JsonString m6233boximpl(String str) {
            return new JsonString(str);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static String m6234constructorimpl(String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            return jsonString;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m6235equalsimpl(String str, Object obj) {
            return (obj instanceof JsonString) && Intrinsics.areEqual(str, ((JsonString) obj).m6239unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m6236equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m6237hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m6238toStringimpl(String str) {
            return "JsonString(jsonString=" + str + ')';
        }

        public boolean equals(Object obj) {
            return m6235equalsimpl(this.jsonString, obj);
        }

        public int hashCode() {
            return m6237hashCodeimpl(this.jsonString);
        }

        public String toString() {
            return m6238toStringimpl(this.jsonString);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m6239unboximpl() {
            return this.jsonString;
        }

        private /* synthetic */ JsonString(String str) {
            this.jsonString = str;
        }

        public final String getJsonString() {
            return this.jsonString;
        }
    }

    /* compiled from: LottieCompositionSpec.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "uri", "Landroid/net/Uri;", "constructor-impl", "(Landroid/net/Uri;)Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "equals", "", "other", "", "equals-impl", "(Landroid/net/Uri;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroid/net/Uri;)I", "toString", "", "toString-impl", "(Landroid/net/Uri;)Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    /* loaded from: classes2.dex */
    public static final class ContentProvider implements LottieCompositionSpec {
        private final Uri uri;

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ ContentProvider m6219boximpl(Uri uri) {
            return new ContentProvider(uri);
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static Uri m6220constructorimpl(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return uri;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m6221equalsimpl(Uri uri, Object obj) {
            return (obj instanceof ContentProvider) && Intrinsics.areEqual(uri, ((ContentProvider) obj).m6225unboximpl());
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m6222equalsimpl0(Uri uri, Uri uri2) {
            return Intrinsics.areEqual(uri, uri2);
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m6223hashCodeimpl(Uri uri) {
            return uri.hashCode();
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m6224toStringimpl(Uri uri) {
            return "ContentProvider(uri=" + uri + ')';
        }

        public boolean equals(Object obj) {
            return m6221equalsimpl(this.uri, obj);
        }

        public int hashCode() {
            return m6223hashCodeimpl(this.uri);
        }

        public String toString() {
            return m6224toStringimpl(this.uri);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ Uri m6225unboximpl() {
            return this.uri;
        }

        private /* synthetic */ ContentProvider(Uri uri) {
            this.uri = uri;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }
}
