package com.canhub.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.k;
import com.canhub.cropper.CropImageView;
import com.theinnerhour.b2b.R;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: CropImage.java */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: CropImage.java */
    /* loaded from: classes.dex */
    public static final class a extends CropImageView.a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0129a();

        /* compiled from: CropImage.java */
        /* renamed from: com.canhub.cropper.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0129a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i6) {
                return new a[i6];
            }
        }

        public a(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i6, Rect rect2, int i10) {
            super(uri, uri2, exc, fArr, rect, rect2, i6, i10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f6022u, i6);
            parcel.writeParcelable(this.f6023v, i6);
            parcel.writeSerializable(this.f6024w);
            parcel.writeFloatArray(this.f6025x);
            parcel.writeParcelable(this.f6026y, i6);
            parcel.writeParcelable(this.f6027z, i6);
            parcel.writeInt(this.A);
            parcel.writeInt(this.B);
        }

        public a(Parcel parcel) {
            super((Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    public static Uri a(Context context) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            try {
                return FileProvider.b(context, context.getPackageName() + ".cropper.fileprovider", new File(externalFilesDir.getPath(), "pickImageResult.jpeg"));
            } catch (Exception unused) {
                return Uri.fromFile(new File(externalFilesDir.getPath(), "pickImageResult.jpeg"));
            }
        }
        return Uri.fromFile(new File(context.getExternalCacheDir().getPath(), "pickImageResult.jpeg"));
    }

    public static boolean b(Context context) {
        boolean z10;
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    if (str.equalsIgnoreCase("android.permission.CAMERA")) {
                        z10 = true;
                        break;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        z10 = false;
        if (z10) {
            checkSelfPermission = context.checkSelfPermission("android.permission.CAMERA");
            if (checkSelfPermission == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean c(Context context, Uri uri) {
        int checkSelfPermission;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            checkSelfPermission = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
            if (checkSelfPermission == 0) {
                return false;
            }
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    openInputStream.close();
                }
                z10 = false;
            } catch (Exception unused) {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void d(Activity activity) {
        boolean z10;
        String string = activity.getString(R.string.pick_image_intent_chooser_title);
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = activity.getPackageManager();
        if (!b(activity)) {
            ArrayList arrayList2 = new ArrayList();
            Uri a10 = a(activity);
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
                Intent intent2 = new Intent(intent);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (a10 != null) {
                    intent2.putExtra("output", a10);
                }
                arrayList2.add(intent2);
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(intent);
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
        intent3.setType("image/*");
        intent3.addCategory("android.intent.category.OPENABLE");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent3, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && queryIntentActivities.size() > 2) {
            Collections.sort(queryIntentActivities, new p0.d(1));
            queryIntentActivities = queryIntentActivities.subList(0, 2);
        }
        for (ResolveInfo resolveInfo2 : queryIntentActivities) {
            Intent intent4 = new Intent(intent3);
            ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
            intent4.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
            intent4.setPackage(resolveInfo2.activityInfo.packageName);
            arrayList3.add(intent4);
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(intent3);
        }
        arrayList.addAll(arrayList3);
        Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), string);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        activity.startActivityForResult(createChooser, k.d.DEFAULT_DRAG_ANIMATION_DURATION);
    }
}
