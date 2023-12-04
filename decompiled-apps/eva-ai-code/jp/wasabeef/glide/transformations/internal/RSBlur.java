package jp.wasabeef.glide.transformations.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
/* loaded from: classes4.dex */
public class RSBlur {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap blur(Context context, Bitmap bitmap, int radius) throws RSRuntimeException {
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation allocation;
        Allocation allocation2;
        ScriptIntrinsicBlur scriptIntrinsicBlur2 = null;
        try {
            RenderScript create = RenderScript.create(context);
            try {
                create.setMessageHandler(new RenderScript.RSMessageHandler());
                allocation = Allocation.createFromBitmap(create, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocation2 = Allocation.createTyped(create, allocation.getType());
                    try {
                        scriptIntrinsicBlur2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                        scriptIntrinsicBlur2.setInput(allocation);
                        scriptIntrinsicBlur2.setRadius(radius);
                        scriptIntrinsicBlur2.forEach(allocation2);
                        allocation2.copyTo(bitmap);
                        if (create != 0) {
                            RenderScript.releaseAllContexts();
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
                    } catch (Throwable th) {
                        th = th;
                        ScriptIntrinsicBlur scriptIntrinsicBlur3 = scriptIntrinsicBlur2;
                        scriptIntrinsicBlur2 = create;
                        scriptIntrinsicBlur = scriptIntrinsicBlur3;
                        if (scriptIntrinsicBlur2 != null) {
                            RenderScript.releaseAllContexts();
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
                    allocation2 = null;
                    scriptIntrinsicBlur2 = create;
                    scriptIntrinsicBlur = allocation2;
                    if (scriptIntrinsicBlur2 != null) {
                    }
                    if (allocation != null) {
                    }
                    if (allocation2 != null) {
                    }
                    if (scriptIntrinsicBlur != null) {
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                allocation = null;
                allocation2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            scriptIntrinsicBlur = null;
            allocation = null;
            allocation2 = null;
        }
    }
}
