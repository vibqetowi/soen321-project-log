package com.canhub.cropper;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.l;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.d;
import com.theinnerhour.b2b.R;
import f5.f;
import g0.a;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: CropImageActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropImageActivity;", "Landroidx/appcompat/app/c;", "Lcom/canhub/cropper/CropImageView$h;", "Lcom/canhub/cropper/CropImageView$d;", "<init>", "()V", "cropper_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public class CropImageActivity extends androidx.appcompat.app.c implements CropImageView.h, CropImageView.d {

    /* renamed from: v  reason: collision with root package name */
    public Uri f6007v;

    /* renamed from: w  reason: collision with root package name */
    public f f6008w;

    /* renamed from: x  reason: collision with root package name */
    public CropImageView f6009x;

    /* renamed from: y  reason: collision with root package name */
    public l f6010y;

    public static void o0(Menu menu, int i6, int i10) {
        Drawable icon;
        i.g(menu, "menu");
        MenuItem findItem = menu.findItem(i6);
        if (findItem != null && (icon = findItem.getIcon()) != null) {
            try {
                icon.mutate();
                icon.setColorFilter(j0.a.a(i10));
                findItem.setIcon(icon);
            } catch (Exception e10) {
                Log.w("AIC", "Failed to update menu item color", e10);
            }
        }
    }

    @Override // com.canhub.cropper.CropImageView.h
    public final void G(CropImageView cropImageView, Uri uri, Exception exc) {
        CropImageView cropImageView2;
        CropImageView cropImageView3;
        i.g(uri, "uri");
        if (exc == null) {
            f fVar = this.f6008w;
            if (fVar != null) {
                Rect rect = fVar.f14828h0;
                if (rect != null && (cropImageView3 = this.f6009x) != null) {
                    cropImageView3.setCropRect(rect);
                }
                f fVar2 = this.f6008w;
                if (fVar2 != null) {
                    int i6 = fVar2.f14829i0;
                    if (i6 > -1 && (cropImageView2 = this.f6009x) != null) {
                        cropImageView2.setRotatedDegrees(i6);
                        return;
                    }
                    return;
                }
                i.q("options");
                throw null;
            }
            i.q("options");
            throw null;
        }
        n0(null, exc, 1);
    }

    @Override // com.canhub.cropper.CropImageView.d
    public final void c0(CropImageView cropImageView, CropImageView.a aVar) {
        n0(aVar.f6023v, aVar.f6024w, aVar.B);
    }

    public final void n0(Uri uri, Exception exc, int i6) {
        int i10;
        Uri uri2;
        float[] fArr;
        Rect rect;
        int i11;
        Rect rect2;
        if (exc != null) {
            i10 = 204;
        } else {
            i10 = -1;
        }
        CropImageView cropImageView = this.f6009x;
        if (cropImageView != null) {
            uri2 = cropImageView.getImageUri();
        } else {
            uri2 = null;
        }
        CropImageView cropImageView2 = this.f6009x;
        if (cropImageView2 != null) {
            fArr = cropImageView2.getCropPoints();
        } else {
            fArr = null;
        }
        CropImageView cropImageView3 = this.f6009x;
        if (cropImageView3 != null) {
            rect = cropImageView3.getCropRect();
        } else {
            rect = null;
        }
        CropImageView cropImageView4 = this.f6009x;
        if (cropImageView4 != null) {
            i11 = cropImageView4.getRotatedDegrees();
        } else {
            i11 = 0;
        }
        CropImageView cropImageView5 = this.f6009x;
        if (cropImageView5 != null) {
            rect2 = cropImageView5.getWholeImageRect();
        } else {
            rect2 = null;
        }
        d.a aVar = new d.a(uri2, uri, exc, fArr, rect, i11, rect2, i6);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", aVar);
        setResult(i10, intent);
        finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        boolean z10;
        Uri a10;
        String action;
        super.onActivityResult(i6, i10, intent);
        if (i6 == 200) {
            boolean z11 = false;
            if (i10 == 0) {
                setResult(0);
                finish();
            }
            if (i10 == -1) {
                if (intent != null && intent.getData() != null && ((action = intent.getAction()) == null || !action.equals("android.media.action.IMAGE_CAPTURE"))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10 && intent.getData() != null) {
                    a10 = intent.getData();
                } else {
                    a10 = d.a(this);
                }
                this.f6007v = a10;
                if (a10 != null && d.c(this, a10)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        z11 = true;
                    }
                    if (z11) {
                        requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                        return;
                    }
                }
                CropImageView cropImageView = this.f6009x;
                if (cropImageView != null) {
                    cropImageView.setImageUriAsync(this.f6007v);
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        finish();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Uri uri;
        f fVar;
        CharSequence string;
        boolean z10;
        super.onCreate(bundle);
        boolean z11 = false;
        View inflate = getLayoutInflater().inflate(R.layout.crop_image_activity, (ViewGroup) null, false);
        if (inflate != null) {
            CropImageView cropImageView = (CropImageView) inflate;
            l lVar = new l(cropImageView, 9, cropImageView);
            this.f6010y = lVar;
            setContentView((CropImageView) lVar.f1471v);
            l lVar2 = this.f6010y;
            if (lVar2 != null) {
                CropImageView cropImageView2 = (CropImageView) lVar2.f1472w;
                i.f(cropImageView2, "binding.cropImageView");
                this.f6009x = cropImageView2;
                Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
                if (bundleExtra != null) {
                    uri = (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
                } else {
                    uri = null;
                }
                this.f6007v = uri;
                if (bundleExtra == null || (fVar = (f) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS")) == null) {
                    fVar = new f();
                }
                this.f6008w = fVar;
                if (bundle == null) {
                    Uri uri2 = this.f6007v;
                    if (uri2 != null && !i.b(uri2, Uri.EMPTY)) {
                        Uri uri3 = this.f6007v;
                        if (uri3 != null && d.c(this, uri3)) {
                            if (Build.VERSION.SDK_INT >= 23) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                            }
                        }
                        CropImageView cropImageView3 = this.f6009x;
                        if (cropImageView3 != null) {
                            cropImageView3.setImageUriAsync(this.f6007v);
                        }
                    } else if (d.b(this)) {
                        requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
                    } else {
                        d.d(this);
                    }
                }
                g.a l02 = l0();
                if (l02 != null) {
                    f fVar2 = this.f6008w;
                    if (fVar2 != null) {
                        CharSequence charSequence = fVar2.Y;
                        if (charSequence != null) {
                            if (fVar2 != null) {
                                if (charSequence.length() > 0) {
                                    z11 = true;
                                }
                                if (z11) {
                                    f fVar3 = this.f6008w;
                                    if (fVar3 != null) {
                                        string = fVar3.Y;
                                        setTitle(string);
                                        l02.m(true);
                                        return;
                                    }
                                    i.q("options");
                                    throw null;
                                }
                            } else {
                                i.q("options");
                                throw null;
                            }
                        }
                        string = getResources().getString(R.string.crop_image_activity_title);
                        setTitle(string);
                        l02.m(true);
                        return;
                    }
                    i.q("options");
                    throw null;
                }
                return;
            }
            i.q("binding");
            throw null;
        }
        throw new NullPointerException("rootView");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateOptionsMenu(Menu menu) {
        Exception e10;
        Drawable drawable;
        f fVar;
        f fVar2;
        i.g(menu, "menu");
        getMenuInflater().inflate(R.menu.crop_image_menu, menu);
        f fVar3 = this.f6008w;
        if (fVar3 != null) {
            if (!fVar3.f14830j0) {
                menu.removeItem(R.id.ic_rotate_left_24);
                menu.removeItem(R.id.ic_rotate_right_24);
            } else if (fVar3.f14832l0) {
                MenuItem findItem = menu.findItem(R.id.ic_rotate_left_24);
                i.f(findItem, "menu.findItem(R.id.ic_rotate_left_24)");
                findItem.setVisible(true);
            }
            f fVar4 = this.f6008w;
            if (fVar4 != null) {
                if (!fVar4.f14831k0) {
                    menu.removeItem(R.id.ic_flip_24);
                }
                f fVar5 = this.f6008w;
                if (fVar5 != null) {
                    if (fVar5.f14836p0 != null) {
                        MenuItem findItem2 = menu.findItem(R.id.crop_image_menu_crop);
                        i.f(findItem2, "menu.findItem(R.id.crop_image_menu_crop)");
                        f fVar6 = this.f6008w;
                        if (fVar6 != null) {
                            findItem2.setTitle(fVar6.f14836p0);
                        } else {
                            i.q("options");
                            throw null;
                        }
                    }
                    try {
                        fVar2 = this.f6008w;
                    } catch (Exception e11) {
                        e10 = e11;
                        drawable = null;
                    }
                    if (fVar2 != null) {
                        int i6 = fVar2.f14837q0;
                        if (i6 != 0) {
                            Object obj = g0.a.f16164a;
                            drawable = a.c.b(this, i6);
                            try {
                                MenuItem findItem3 = menu.findItem(R.id.crop_image_menu_crop);
                                i.f(findItem3, "menu.findItem(R.id.crop_image_menu_crop)");
                                findItem3.setIcon(drawable);
                            } catch (Exception e12) {
                                e10 = e12;
                                Log.w("AIC", "Failed to read menu crop drawable", e10);
                                fVar = this.f6008w;
                                if (fVar == null) {
                                }
                            }
                        } else {
                            drawable = null;
                        }
                        fVar = this.f6008w;
                        if (fVar == null) {
                            int i10 = fVar.Z;
                            if (i10 != 0) {
                                o0(menu, R.id.ic_rotate_left_24, i10);
                                f fVar7 = this.f6008w;
                                if (fVar7 != null) {
                                    o0(menu, R.id.ic_rotate_right_24, fVar7.Z);
                                    f fVar8 = this.f6008w;
                                    if (fVar8 != null) {
                                        o0(menu, R.id.ic_flip_24, fVar8.Z);
                                        if (drawable != null) {
                                            f fVar9 = this.f6008w;
                                            if (fVar9 != null) {
                                                o0(menu, R.id.crop_image_menu_crop, fVar9.Z);
                                            } else {
                                                i.q("options");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        i.q("options");
                                        throw null;
                                    }
                                } else {
                                    i.q("options");
                                    throw null;
                                }
                            }
                            return true;
                        }
                        i.q("options");
                        throw null;
                    }
                    i.q("options");
                    throw null;
                }
                i.q("options");
                throw null;
            }
            i.q("options");
            throw null;
        }
        i.q("options");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        String str;
        i.g(item, "item");
        int itemId = item.getItemId();
        boolean z10 = false;
        if (itemId == R.id.crop_image_menu_crop) {
            f fVar = this.f6008w;
            if (fVar != null) {
                if (fVar.f14827g0) {
                    n0(null, null, 1);
                } else {
                    Uri uri = fVar.f14823a0;
                    if (uri == null || i.b(uri, Uri.EMPTY)) {
                        try {
                            f fVar2 = this.f6008w;
                            if (fVar2 != null) {
                                int i6 = f5.d.f14816a[fVar2.f14824b0.ordinal()];
                                if (i6 != 1) {
                                    if (i6 != 2) {
                                        str = ".webp";
                                    } else {
                                        str = ".png";
                                    }
                                } else {
                                    str = ".jpg";
                                }
                                if (Build.VERSION.SDK_INT >= 29) {
                                    z10 = true;
                                }
                                if (z10) {
                                    try {
                                        File file = File.createTempFile("cropped", str, getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                                        Context applicationContext = getApplicationContext();
                                        i.f(applicationContext, "applicationContext");
                                        i.f(file, "file");
                                        uri = kc.f.G(applicationContext, file);
                                    } catch (Exception e10) {
                                        Log.e("CropImageActivity", String.valueOf(e10.getMessage()));
                                        File file2 = File.createTempFile("cropped", str, getCacheDir());
                                        Context applicationContext2 = getApplicationContext();
                                        i.f(applicationContext2, "applicationContext");
                                        i.f(file2, "file");
                                        uri = kc.f.G(applicationContext2, file2);
                                    }
                                } else {
                                    uri = Uri.fromFile(File.createTempFile("cropped", str, getCacheDir()));
                                }
                            } else {
                                i.q("options");
                                throw null;
                            }
                        } catch (IOException e11) {
                            throw new RuntimeException("Failed to create temp file for output image", e11);
                        }
                    }
                    Uri uri2 = uri;
                    CropImageView cropImageView = this.f6009x;
                    if (cropImageView != null) {
                        f fVar3 = this.f6008w;
                        if (fVar3 != null) {
                            Bitmap.CompressFormat compressFormat = fVar3.f14824b0;
                            int i10 = fVar3.c0;
                            int i11 = fVar3.f14825d0;
                            int i12 = fVar3.e0;
                            int i13 = fVar3.f14826f0;
                            if (cropImageView.R != null) {
                                cropImageView.i(i11, i12, i10, compressFormat, uri2, i13);
                            } else {
                                throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
                            }
                        } else {
                            i.q("options");
                            throw null;
                        }
                    }
                }
            } else {
                i.q("options");
                throw null;
            }
        } else if (itemId == R.id.ic_rotate_left_24) {
            f fVar4 = this.f6008w;
            if (fVar4 != null) {
                int i14 = -fVar4.f14833m0;
                CropImageView cropImageView2 = this.f6009x;
                if (cropImageView2 != null) {
                    cropImageView2.e(i14);
                }
            } else {
                i.q("options");
                throw null;
            }
        } else if (itemId == R.id.ic_rotate_right_24) {
            f fVar5 = this.f6008w;
            if (fVar5 != null) {
                CropImageView cropImageView3 = this.f6009x;
                if (cropImageView3 != null) {
                    cropImageView3.e(fVar5.f14833m0);
                }
            } else {
                i.q("options");
                throw null;
            }
        } else if (itemId == R.id.ic_flip_24_horizontally) {
            CropImageView cropImageView4 = this.f6009x;
            if (cropImageView4 != null) {
                cropImageView4.F = !cropImageView4.F;
                cropImageView4.a(cropImageView4.getWidth(), cropImageView4.getHeight(), true, false);
            }
        } else if (itemId == R.id.ic_flip_24_vertically) {
            CropImageView cropImageView5 = this.f6009x;
            if (cropImageView5 != null) {
                cropImageView5.G = !cropImageView5.G;
                cropImageView5.a(cropImageView5.getWidth(), cropImageView5.getHeight(), true, false);
            }
        } else if (itemId == 16908332) {
            setResult(0);
            finish();
        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i6, String[] permissions, int[] grantResults) {
        boolean z10;
        i.g(permissions, "permissions");
        i.g(grantResults, "grantResults");
        if (i6 == 201) {
            Uri uri = this.f6007v;
            if (uri != null) {
                if (grantResults.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((!z10) && grantResults[0] == 0) {
                    CropImageView cropImageView = this.f6009x;
                    if (cropImageView != null) {
                        cropImageView.setImageUriAsync(uri);
                        return;
                    }
                    return;
                }
            }
            Toast.makeText(this, (int) R.string.crop_image_activity_no_permissions, 1).show();
            setResult(0);
            finish();
        } else if (i6 == 2011) {
            d.d(this);
        } else {
            super.onRequestPermissionsResult(i6, permissions, grantResults);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        CropImageView cropImageView = this.f6009x;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.f6009x;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        super.onStop();
        CropImageView cropImageView = this.f6009x;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.f6009x;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }
}
