package com.ifriend.registration.presentation.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: AttachLongTapDebugActivator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"attachLongTapDebugActivator", "", "Landroid/view/View;", "context", "Landroid/content/Context;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AttachLongTapDebugActivatorKt {
    public static final void attachLongTapDebugActivator(View view, final Context context) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        final Ref.LongRef longRef = new Ref.LongRef();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.ifriend.registration.presentation.ui.AttachLongTapDebugActivatorKt$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean attachLongTapDebugActivator$lambda$1;
                attachLongTapDebugActivator$lambda$1 = AttachLongTapDebugActivatorKt.attachLongTapDebugActivator$lambda$1(Ref.LongRef.this, context, view2, motionEvent);
                return attachLongTapDebugActivator$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachLongTapDebugActivator$lambda$1(Ref.LongRef touchTime, Context context, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(touchTime, "$touchTime");
        Intrinsics.checkNotNullParameter(context, "$context");
        int action = motionEvent.getAction();
        if (action == 0) {
            touchTime.element = System.currentTimeMillis();
        } else if (action == 1) {
            if (System.currentTimeMillis() - touchTime.element > 2500) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
                SharedPreferences.Editor editor = sharedPreferences.edit();
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                editor.putBoolean(OkHttpClientProviderKt.DEBUG_KEY, true);
                editor.apply();
                Toast.makeText(context, "Debug mode", 0).show();
            }
            touchTime.element = 0L;
        }
        return true;
    }
}
