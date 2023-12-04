package com.ifriend.ui.utils.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SafeRSBlur.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/ifriend/ui/utils/blur/SafeRSBlur;", "", "()V", "blur", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "bitmap", "radius", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SafeRSBlur {
    public static final int $stable = 0;
    public static final SafeRSBlur INSTANCE = new SafeRSBlur();

    private SafeRSBlur() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap blur(Context context, Bitmap bitmap, int i) {
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation allocation;
        Allocation allocation2;
        RenderScript create;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        RenderScript renderScript = null;
        ScriptIntrinsicBlur scriptIntrinsicBlur2 = null;
        try {
            create = RenderScript.create(context);
            try {
                create.setMessageHandler(new RenderScript.RSMessageHandler());
                allocation = Allocation.createFromBitmap(create, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocation2 = Allocation.createTyped(create, allocation.getType());
                } catch (Throwable th) {
                    th = th;
                    allocation2 = null;
                    renderScript = create;
                    scriptIntrinsicBlur = allocation2;
                    if (renderScript != null) {
                        renderScript.destroy();
                    }
                    if (allocation != null) {
                        allocation.destroy();
                    }
                    if (allocation2 != null) {
                        allocation2.destroy();
                    }
                    if (scriptIntrinsicBlur != null) {
                        scriptIntrinsicBlur.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                allocation = null;
                allocation2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            scriptIntrinsicBlur = null;
            allocation = null;
            allocation2 = null;
        }
        try {
            scriptIntrinsicBlur2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            scriptIntrinsicBlur2.setInput(allocation);
            scriptIntrinsicBlur2.setRadius(i);
            scriptIntrinsicBlur2.forEach(allocation2);
            allocation2.copyTo(bitmap);
            if (create != null) {
                create.destroy();
            }
            if (allocation != null) {
                allocation.destroy();
            }
            if (allocation2 != null) {
                allocation2.destroy();
            }
            if (scriptIntrinsicBlur2 != null) {
                scriptIntrinsicBlur2.destroy();
            }
            return bitmap;
        } catch (Throwable th4) {
            th = th4;
            ScriptIntrinsicBlur scriptIntrinsicBlur3 = scriptIntrinsicBlur2;
            renderScript = create;
            scriptIntrinsicBlur = scriptIntrinsicBlur3;
            if (renderScript != null) {
            }
            if (allocation != null) {
            }
            if (allocation2 != null) {
            }
            if (scriptIntrinsicBlur != null) {
            }
            throw th;
        }
    }
}
