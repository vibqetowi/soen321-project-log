package qm;

import android.os.Bundle;
import com.google.firebase.storage.StorageReference;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: JournalBasicFragment.kt */
/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.k implements ss.l<ImageResponse, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f29874u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(1);
        this.f29874u = jVar;
    }

    @Override // ss.l
    public final hs.k invoke(ImageResponse imageResponse) {
        ImageResponse imageResponse2 = imageResponse;
        j jVar = this.f29874u;
        try {
            if (jVar.E.size() > 0 && jVar.H >= 0) {
                ImageResponse.Pending pending = ImageResponse.Pending.INSTANCE;
                boolean b10 = kotlin.jvm.internal.i.b(imageResponse2, pending);
                ArrayList<JournalAttachImageModel> arrayList = jVar.E;
                if (b10) {
                    arrayList.get(jVar.H).setImageUploadStatus(pending);
                } else {
                    ImageResponse.UploadingStarted uploadingStarted = ImageResponse.UploadingStarted.INSTANCE;
                    String str = null;
                    if (kotlin.jvm.internal.i.b(imageResponse2, uploadingStarted)) {
                        jVar.I = true;
                        mm.b bVar = jVar.G;
                        if (bVar != null) {
                            bVar.z(jVar.H, "uploading");
                            arrayList.get(jVar.H).setImageUploadStatus(uploadingStarted);
                        } else {
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        }
                    } else if (imageResponse2 instanceof ImageResponse.Uploading) {
                        jVar.I = true;
                        mm.b bVar2 = jVar.G;
                        if (bVar2 != null) {
                            double progress = ((ImageResponse.Uploading) imageResponse2).getProgress();
                            int i6 = jVar.H;
                            Bundle bundle = new Bundle();
                            bundle.putDouble(Constants.SCREEN_PROGRESS, progress);
                            hs.k kVar = hs.k.f19476a;
                            bVar2.f2769u.d(i6, 1, bundle);
                            arrayList.get(jVar.H).setImageUploadStatus(new ImageResponse.Uploading(((ImageResponse.Uploading) imageResponse2).getProgress()));
                        } else {
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        }
                    } else {
                        int i10 = 0;
                        if (imageResponse2 instanceof ImageResponse.Success) {
                            mm.b bVar3 = jVar.G;
                            if (bVar3 != null) {
                                bVar3.y(jVar.H, ((ImageResponse.Success) imageResponse2).getImageUrl());
                                arrayList.get(jVar.H).setImageUploadStatus(new ImageResponse.Success(((ImageResponse.Success) imageResponse2).getImageUrl(), null, 2, null));
                                arrayList.get(jVar.H).setImageUploadedURL(((ImageResponse.Success) imageResponse2).getImageUrl());
                                tm.a aVar = jVar.O().A;
                                StorageReference storageRef = ((ImageResponse.Success) imageResponse2).getStorageRef();
                                if (storageRef != null) {
                                    aVar.f33283c[aVar.f33281a].add(storageRef);
                                } else {
                                    aVar.getClass();
                                }
                                jVar.I = false;
                                jVar.J();
                                String str2 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("template", jVar.O().A.b());
                                if (!arrayList.isEmpty()) {
                                    Iterator<JournalAttachImageModel> it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        if ((it.next().getImageUploadStatus() instanceof ImageResponse.Success) && (i10 = i10 + 1) < 0) {
                                            ca.a.s1();
                                            throw null;
                                        }
                                    }
                                }
                                bundle2.putInt("number_of_images", i10);
                                if (jVar.O().H && jVar.O().J != null) {
                                    JournalModel journalModel = jVar.O().J;
                                    if (journalModel != null) {
                                        str = journalModel.getId();
                                    }
                                } else {
                                    str = "fresh_entry";
                                }
                                bundle2.putString("entry_id", str);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_image_add_success");
                            } else {
                                kotlin.jvm.internal.i.q("adapter");
                                throw null;
                            }
                        } else if (imageResponse2 instanceof ImageResponse.Failure) {
                            mm.b bVar4 = jVar.G;
                            if (bVar4 != null) {
                                bVar4.z(jVar.H, "failure");
                                arrayList.get(jVar.H).setImageUploadStatus(new ImageResponse.Failure(((ImageResponse.Failure) imageResponse2).getMessage()));
                                jVar.I = false;
                                jVar.J();
                            } else {
                                kotlin.jvm.internal.i.q("adapter");
                                throw null;
                            }
                        } else if (imageResponse2 instanceof ImageResponse.Cancelled) {
                            arrayList.get(jVar.H).setImageUploadStatus(ImageResponse.Cancelled.INSTANCE);
                            jVar.F(jVar.J);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(jVar.f29875v, e10);
        }
        return hs.k.f19476a;
    }
}
