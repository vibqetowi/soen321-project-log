package com.ifriend.chat.presentation.utils;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ScreenshotDetectionDelegate.kt */
@Deprecated(message = "must be reworked")
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001b\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0007J\u0006\u0010\u001e\u001a\u00020\u001aR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ifriend/chat/presentation/utils/ScreenshotDetectionDelegate;", "", "activity", "Landroid/app/Activity;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ifriend/chat/presentation/utils/ScreenshotDetectionDelegate$ScreenshotDetectionListener;", "(Landroid/app/Activity;Lcom/ifriend/chat/presentation/utils/ScreenshotDetectionDelegate$ScreenshotDetectionListener;)V", "activityReference", "Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;Lcom/ifriend/chat/presentation/utils/ScreenshotDetectionDelegate$ScreenshotDetectionListener;)V", "job", "Lkotlinx/coroutines/Job;", "createContentObserverFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroid/net/Uri;", "getFilePathFromContentResolver", "", "context", "Landroid/content/Context;", "uri", "getPublicScreenshotDirectoryName", "isReadExternalStoragePermissionGranted", "", "isScreenshotPath", ClientCookie.PATH_ATTR, "onContentChanged", "", "onScreenCaptured", "onScreenCapturedWithDeniedPermission", "startScreenshotDetection", "stopScreenshotDetection", "Companion", "ScreenshotDetectionListener", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScreenshotDetectionDelegate {
    private static final String TAG = "ScreenshotDetection";
    private final WeakReference<Activity> activityReference;
    private Job job;
    private final ScreenshotDetectionListener listener;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ScreenshotDetectionDelegate.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/utils/ScreenshotDetectionDelegate$ScreenshotDetectionListener;", "", "onScreenCaptured", "", ClientCookie.PATH_ATTR, "", "onScreenCapturedWithDeniedPermission", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface ScreenshotDetectionListener {
        void onScreenCaptured(String str);

        void onScreenCapturedWithDeniedPermission();
    }

    public ScreenshotDetectionDelegate(WeakReference<Activity> activityReference, ScreenshotDetectionListener listener) {
        Intrinsics.checkNotNullParameter(activityReference, "activityReference");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.activityReference = activityReference;
        this.listener = listener;
    }

    /* compiled from: ScreenshotDetectionDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/utils/ScreenshotDetectionDelegate$Companion;", "", "()V", "TAG", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScreenshotDetectionDelegate(Activity activity, ScreenshotDetectionListener listener) {
        this(new WeakReference(activity), listener);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public final void startScreenshotDetection() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ScreenshotDetectionDelegate$startScreenshotDetection$1(this, null), 3, null);
        this.job = launch$default;
    }

    public final void stopScreenshotDetection() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final Flow<Uri> createContentObserverFlow() {
        return FlowKt.channelFlow(new ScreenshotDetectionDelegate$createContentObserverFlow$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContentChanged(Context context, Uri uri) {
        if (isReadExternalStoragePermissionGranted()) {
            String filePathFromContentResolver = getFilePathFromContentResolver(context, uri);
            if (filePathFromContentResolver == null || !isScreenshotPath(filePathFromContentResolver)) {
                return;
            }
            onScreenCaptured(filePathFromContentResolver);
            return;
        }
        onScreenCapturedWithDeniedPermission();
    }

    private final void onScreenCaptured(String str) {
        this.listener.onScreenCaptured(str);
    }

    private final void onScreenCapturedWithDeniedPermission() {
        this.listener.onScreenCapturedWithDeniedPermission();
    }

    private final boolean isScreenshotPath(String str) {
        String str2;
        String str3;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str2 = null;
        }
        String publicScreenshotDirectoryName = getPublicScreenshotDirectoryName();
        if (publicScreenshotDirectoryName != null) {
            str3 = publicScreenshotDirectoryName.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            str3 = null;
        }
        if (str3 != null) {
            if (str2 != null && StringsKt.contains$default((CharSequence) str2, (CharSequence) str3, false, 2, (Object) null)) {
                return true;
            }
        }
        return str2 != null && StringsKt.contains$default((CharSequence) str2, (CharSequence) "screenshot", false, 2, (Object) null);
    }

    private final String getPublicScreenshotDirectoryName() {
        String str;
        if (Build.VERSION.SDK_INT >= 29) {
            str = Environment.DIRECTORY_SCREENSHOTS;
            return Environment.getExternalStoragePublicDirectory(str).getName();
        }
        return null;
    }

    private final String getFilePathFromContentResolver(Context context, Uri uri) {
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name", "_data"}, null, null, null);
            if (query != null) {
                query.moveToFirst();
                if (query.getCount() > 0) {
                    int columnIndex = query.getColumnIndex("_data");
                    String string = columnIndex > 0 ? query.getString(columnIndex) : null;
                    query.close();
                    return string;
                }
                query.close();
                return null;
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Log.w(TAG, message);
        }
        return null;
    }

    private final boolean isReadExternalStoragePermissionGranted() {
        Activity activity = this.activityReference.get();
        return activity != null && ContextCompat.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }
}
