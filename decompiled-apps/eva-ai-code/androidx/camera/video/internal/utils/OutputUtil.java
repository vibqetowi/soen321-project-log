package androidx.camera.video.internal.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.camera.core.Logger;
import java.io.File;
/* loaded from: classes.dex */
public final class OutputUtil {
    private static final String TAG = "OutputUtil";

    private OutputUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getAbsolutePathFromUri(ContentResolver contentResolver, Uri uri, String str) {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = contentResolver.query(uri, new String[]{str}, null, null, null);
            if (cursor == null) {
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            try {
                try {
                    int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
                    cursor.moveToFirst();
                    String string = cursor.getString(columnIndexOrThrow);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return string;
                } catch (RuntimeException e) {
                    e = e;
                    Logger.e(TAG, String.format("Failed in getting absolute path for Uri %s with Exception %s", uri.toString(), e.toString()));
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (RuntimeException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public static boolean createParentFolder(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        return parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs();
    }
}
