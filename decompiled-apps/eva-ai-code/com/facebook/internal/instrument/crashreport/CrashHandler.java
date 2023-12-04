package com.facebook.internal.instrument.crashreport;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.ExceptionAnalyzer;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: CrashHandler.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/instrument/crashreport/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "previousHandler", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "uncaughtException", "", "t", "Ljava/lang/Thread;", "e", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CrashHandler implements Thread.UncaughtExceptionHandler {
    private static final int MAX_CRASH_REPORT_NUM = 5;
    private static CrashHandler instance;
    private final Thread.UncaughtExceptionHandler previousHandler;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = CrashHandler.class.getCanonicalName();

    public /* synthetic */ CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    @JvmStatic
    public static final synchronized void enable() {
        synchronized (CrashHandler.class) {
            Companion.enable();
        }
    }

    private CrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.previousHandler = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t, Throwable e) {
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(e, "e");
        InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
        if (InstrumentUtility.isSDKRelatedException(e)) {
            ExceptionAnalyzer exceptionAnalyzer = ExceptionAnalyzer.INSTANCE;
            ExceptionAnalyzer.execute(e);
            InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
            InstrumentData.Builder.build(e, InstrumentData.Type.CrashReport).save();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(t, e);
    }

    /* compiled from: CrashHandler.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/internal/instrument/crashreport/CrashHandler$Companion;", "", "()V", "MAX_CRASH_REPORT_NUM", "", "TAG", "", "instance", "Lcom/facebook/internal/instrument/crashreport/CrashHandler;", "enable", "", "sendExceptionReports", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final synchronized void enable() {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                sendExceptionReports();
            }
            if (CrashHandler.instance != null) {
                Log.w(CrashHandler.TAG, "Already enabled!");
                return;
            }
            CrashHandler.instance = new CrashHandler(Thread.getDefaultUncaughtExceptionHandler(), null);
            Thread.setDefaultUncaughtExceptionHandler(CrashHandler.instance);
        }

        private final void sendExceptionReports() {
            Utility utility = Utility.INSTANCE;
            if (Utility.isDataProcessingRestricted()) {
                return;
            }
            InstrumentUtility instrumentUtility = InstrumentUtility.INSTANCE;
            File[] listExceptionReportFiles = InstrumentUtility.listExceptionReportFiles();
            ArrayList arrayList = new ArrayList(listExceptionReportFiles.length);
            for (File file : listExceptionReportFiles) {
                InstrumentData.Builder builder = InstrumentData.Builder.INSTANCE;
                arrayList.add(InstrumentData.Builder.load(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            final List sortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.facebook.internal.instrument.crashreport.CrashHandler$Companion$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int m6421sendExceptionReports$lambda2;
                    m6421sendExceptionReports$lambda2 = CrashHandler.Companion.m6421sendExceptionReports$lambda2((InstrumentData) obj2, (InstrumentData) obj3);
                    return m6421sendExceptionReports$lambda2;
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = RangesKt.until(0, Math.min(sortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(sortedWith.get(((IntIterator) it).nextInt()));
            }
            InstrumentUtility instrumentUtility2 = InstrumentUtility.INSTANCE;
            InstrumentUtility.sendReports("crash_reports", jSONArray, new GraphRequest.Callback() { // from class: com.facebook.internal.instrument.crashreport.CrashHandler$Companion$$ExternalSyntheticLambda1
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(GraphResponse graphResponse) {
                    CrashHandler.Companion.m6422sendExceptionReports$lambda5(sortedWith, graphResponse);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: sendExceptionReports$lambda-2  reason: not valid java name */
        public static final int m6421sendExceptionReports$lambda2(InstrumentData instrumentData, InstrumentData o2) {
            Intrinsics.checkNotNullExpressionValue(o2, "o2");
            return instrumentData.compareTo(o2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: sendExceptionReports$lambda-5  reason: not valid java name */
        public static final void m6422sendExceptionReports$lambda5(List validReports, GraphResponse response) {
            Intrinsics.checkNotNullParameter(validReports, "$validReports");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.getError() == null) {
                    JSONObject jsonObject = response.getJsonObject();
                    if (Intrinsics.areEqual((Object) (jsonObject == null ? null : Boolean.valueOf(jsonObject.getBoolean("success"))), (Object) true)) {
                        Iterator it = validReports.iterator();
                        while (it.hasNext()) {
                            ((InstrumentData) it.next()).clear();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }
}
