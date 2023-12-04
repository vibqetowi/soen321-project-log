package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.compose.ComposeNavigator;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: PreviewActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "()V", "TAG", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setComposableContent", "composableFqn", "setParameterizedContent", "className", "methodName", "parameterProvider", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewActivity extends ComponentActivity {
    public static final int $stable = 0;
    private final String TAG = "PreviewActivity";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.TAG, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra(ComposeNavigator.NAME)) == null) {
            return;
        }
        setComposableContent(stringExtra);
    }

    private final void setComposableContent(String str) {
        String str2 = this.TAG;
        Log.d(str2, "PreviewActivity has composable " + str);
        String substringBeforeLast$default = StringsKt.substringBeforeLast$default(str, (char) ClassUtils.PACKAGE_SEPARATOR_CHAR, (String) null, 2, (Object) null);
        String substringAfterLast$default = StringsKt.substringAfterLast$default(str, (char) ClassUtils.PACKAGE_SEPARATOR_CHAR, (String) null, 2, (Object) null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            setParameterizedContent(substringBeforeLast$default, substringAfterLast$default, stringExtra);
            return;
        }
        String str3 = this.TAG;
        Log.d(str3, "Previewing '" + substringAfterLast$default + "' without a parameter provider.");
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-161032931, true, new PreviewActivity$setComposableContent$2(substringBeforeLast$default, substringAfterLast$default)), 1, null);
    }

    private final void setParameterizedContent(String str, String str2, String str3) {
        String str4 = this.TAG;
        Log.d(str4, "Previewing '" + str2 + "' with parameter provider: '" + str3 + '\'');
        Object[] previewProviderParameters = PreviewUtilsKt.getPreviewProviderParameters(PreviewUtilsKt.asPreviewProviderClass(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (previewProviderParameters.length > 1) {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1735847170, true, new PreviewActivity$setParameterizedContent$1(previewProviderParameters, str, str2)), 1, null);
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1507674311, true, new PreviewActivity$setParameterizedContent$2(str, str2, previewProviderParameters)), 1, null);
        }
    }
}
