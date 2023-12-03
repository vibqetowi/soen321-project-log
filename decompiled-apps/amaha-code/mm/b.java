package mm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.List;
import pl.w0;
import r1.b0;
import ss.l;
/* compiled from: JournalAttachImageAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {
    public final l<Integer, k> A;
    public final l<Integer, k> B;
    public final String C;
    public final z4.f D;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<JournalAttachImageModel> f25618x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f25619y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f25620z;

    /* compiled from: JournalAttachImageAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public b(ArrayList images, p pVar, boolean z10, l onRetryClick, l onRemoveItemClick) {
        kotlin.jvm.internal.i.g(images, "images");
        kotlin.jvm.internal.i.g(onRetryClick, "onRetryClick");
        kotlin.jvm.internal.i.g(onRemoveItemClick, "onRemoveItemClick");
        this.f25618x = images;
        this.f25619y = pVar;
        this.f25620z = z10;
        this.A = onRetryClick;
        this.B = onRemoveItemClick;
        this.C = LogHelper.INSTANCE.makeLogTag("JournalAttachImageAdapter");
        z4.f k10 = new z4.f().k(R.drawable.ic_image);
        kotlin.jvm.internal.i.f(k10, "RequestOptions().placeholder(R.drawable.ic_image)");
        this.D = k10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f25618x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, final int i6) {
        a aVar2 = aVar;
        try {
            JournalAttachImageModel journalAttachImageModel = (JournalAttachImageModel) u.j2(i6, this.f25618x);
            if (journalAttachImageModel != null) {
                ImageResponse imageUploadStatus = journalAttachImageModel.getImageUploadStatus();
                boolean b10 = kotlin.jvm.internal.i.b(imageUploadStatus, ImageResponse.Pending.INSTANCE);
                boolean z10 = this.f25620z;
                View view = aVar2.f2751a;
                if (b10) {
                    ((CircularProgressBar) view.findViewById(R.id.progressBar)).setProgress(0.0f);
                    ((CircularProgressBar) view.findViewById(R.id.progressBar)).setVisibility(0);
                    ((ShapeableImageView) view.findViewById(R.id.viewTransparentBackground)).setVisibility(0);
                    ((Group) view.findViewById(R.id.grpJournalRetry)).setVisibility(8);
                    if (!z10) {
                        ((AppCompatImageView) view.findViewById(R.id.ivJournalAttachImageClose)).setVisibility(0);
                    }
                } else if (imageUploadStatus instanceof ImageResponse.UploadingStarted) {
                    ((CircularProgressBar) view.findViewById(R.id.progressBar)).setProgress(0.0f);
                    ((CircularProgressBar) view.findViewById(R.id.progressBar)).setVisibility(0);
                    ((ShapeableImageView) view.findViewById(R.id.viewTransparentBackground)).setVisibility(0);
                    ((Group) view.findViewById(R.id.grpJournalRetry)).setVisibility(8);
                    if (!z10) {
                        ((AppCompatImageView) view.findViewById(R.id.ivJournalAttachImageClose)).setVisibility(8);
                    }
                } else if (imageUploadStatus instanceof ImageResponse.Uploading) {
                    ((CircularProgressBar) view.findViewById(R.id.progressBar)).setVisibility(0);
                    ((ShapeableImageView) view.findViewById(R.id.viewTransparentBackground)).setVisibility(0);
                    ((Group) view.findViewById(R.id.grpJournalRetry)).setVisibility(8);
                    if (!z10) {
                        ((AppCompatImageView) view.findViewById(R.id.ivJournalAttachImageClose)).setVisibility(8);
                    }
                } else if (imageUploadStatus instanceof ImageResponse.Success) {
                    com.bumptech.glide.f g5 = Glide.g(this.f25619y);
                    z4.f fVar = this.D;
                    synchronized (g5) {
                        g5.s(fVar);
                    }
                    com.bumptech.glide.e<Bitmap> a10 = g5.a();
                    a10.Z = journalAttachImageModel.getImageUploadedURL();
                    a10.f5953b0 = true;
                    a10.z(new c(aVar2, this));
                    ((AppCompatImageView) view.findViewById(R.id.ivJournalAttachImage)).setOnClickListener(new w0(this, 5, journalAttachImageModel));
                } else if (imageUploadStatus instanceof ImageResponse.Failure) {
                    ((CircularProgressBar) view.findViewById(R.id.progressBar)).setVisibility(8);
                    ((ShapeableImageView) view.findViewById(R.id.viewTransparentBackground)).setVisibility(0);
                    ((Group) view.findViewById(R.id.grpJournalRetry)).setVisibility(0);
                    if (!z10) {
                        ((AppCompatImageView) view.findViewById(R.id.ivJournalAttachImageClose)).setVisibility(0);
                    }
                    ((AppCompatImageView) view.findViewById(R.id.ivJournalAttachImageRetry)).setOnClickListener(new View.OnClickListener(this) { // from class: mm.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ b f25616v;

                        {
                            this.f25616v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i10 = r3;
                            int i11 = i6;
                            b this$0 = this.f25616v;
                            switch (i10) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.A.invoke(Integer.valueOf(i11));
                                    return;
                                default:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.B.invoke(Integer.valueOf(i11));
                                    return;
                            }
                        }
                    });
                } else {
                    boolean z11 = imageUploadStatus instanceof ImageResponse.Cancelled;
                }
                ((AppCompatImageView) view.findViewById(R.id.ivJournalAttachImageClose)).setOnClickListener(new View.OnClickListener(this) { // from class: mm.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ b f25616v;

                    {
                        this.f25616v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i10 = r3;
                        int i11 = i6;
                        b this$0 = this.f25616v;
                        switch (i10) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.A.invoke(Integer.valueOf(i11));
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.B.invoke(Integer.valueOf(i11));
                                return;
                        }
                    }
                });
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void o(a aVar, int i6, List payloads) {
        a aVar2 = aVar;
        kotlin.jvm.internal.i.g(payloads, "payloads");
        Object i22 = u.i2(payloads);
        boolean z10 = true;
        ArrayList<JournalAttachImageModel> arrayList = this.f25618x;
        View view = aVar2.f2751a;
        if (i22 != null) {
            Object g22 = u.g2(payloads);
            kotlin.jvm.internal.i.e(g22, "null cannot be cast to non-null type android.os.Bundle");
            double d10 = ((Bundle) g22).getDouble(Constants.SCREEN_PROGRESS, 0.0d);
            if (d10 != 0.0d) {
                z10 = false;
            }
            if (!z10) {
                ((CircularProgressBar) view.findViewById(R.id.progressBar)).setProgress((float) d10);
                arrayList.get(i6).setImageUploadStatus(new ImageResponse.Uploading(d10));
            }
            Object g23 = u.g2(payloads);
            kotlin.jvm.internal.i.e(g23, "null cannot be cast to non-null type android.os.Bundle");
            String string = ((Bundle) g23).getString("status");
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode != -1086574198) {
                    if (hashCode == 1239105089 && string.equals("uploading")) {
                        arrayList.get(i6).setImageUploadStatus(ImageResponse.UploadingStarted.INSTANCE);
                    }
                } else if (string.equals("failure")) {
                    arrayList.get(i6).setImageUploadStatus(new ImageResponse.Failure(""));
                }
            }
            Object g24 = u.g2(payloads);
            kotlin.jvm.internal.i.e(g24, "null cannot be cast to non-null type android.os.Bundle");
            String string2 = ((Bundle) g24).getString("imageUploaded");
            if (string2 != null) {
                arrayList.get(i6).setImageUploadStatus(new ImageResponse.Success(string2, null, 2, null));
                arrayList.get(i6).setImageUploadedURL(string2);
            }
        } else {
            Uri imageLink = arrayList.get(i6).getImageLink();
            if (imageLink != null) {
                com.bumptech.glide.f g5 = Glide.g(this.f25619y);
                g5.getClass();
                com.bumptech.glide.e eVar = new com.bumptech.glide.e(g5.f5956u, g5, Drawable.class, g5.f5957v);
                eVar.Z = imageLink;
                eVar.f5953b0 = true;
                eVar.B((AppCompatImageView) view.findViewById(R.id.ivJournalAttachImage));
            }
        }
        n(aVar2, i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_journal_attach_image_view, parent, false, "from(parent.context)\n   …mage_view, parent, false)"));
    }

    public final void v(JournalAttachImageModel journalAttachImageModel) {
        ArrayList<JournalAttachImageModel> arrayList = this.f25618x;
        int size = arrayList.size();
        arrayList.add(journalAttachImageModel);
        this.f2769u.e(size, 1);
    }

    public final void w(ArrayList<JournalAttachImageModel> imageList) {
        kotlin.jvm.internal.i.g(imageList, "imageList");
        ArrayList<JournalAttachImageModel> arrayList = this.f25618x;
        int size = arrayList.size();
        arrayList.addAll(imageList);
        this.f2769u.e(size, imageList.size());
    }

    public final void x(int i6) {
        ArrayList<JournalAttachImageModel> arrayList = this.f25618x;
        if (arrayList.size() > i6) {
            arrayList.remove(i6);
        }
        l(i6);
        k(i6, arrayList.size());
    }

    public final void y(int i6, String url) {
        kotlin.jvm.internal.i.g(url, "url");
        Bundle bundle = new Bundle();
        bundle.putString("imageUploaded", url);
        k kVar = k.f19476a;
        this.f2769u.d(i6, 1, bundle);
    }

    public final void z(int i6, String str) {
        Bundle a10 = b0.a("status", str);
        k kVar = k.f19476a;
        this.f2769u.d(i6, 1, a10);
    }
}
