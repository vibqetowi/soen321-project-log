package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import t0.c;
/* compiled from: AppCompatReceiveContentHelper.java */
/* loaded from: classes.dex */
public final class w {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        c.b c0544c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0544c = new c.a(clipData, 3);
            } else {
                c0544c = new c.C0544c(clipData, 3);
            }
            t0.d0.m(textView, c0544c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th2) {
            textView.endBatchEdit();
            throw th2;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        c.b c0544c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0544c = new c.a(clipData, 3);
        } else {
            c0544c = new c.C0544c(clipData, 3);
        }
        t0.d0.m(view, c0544c.build());
        return true;
    }
}
