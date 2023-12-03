package rm;

import android.os.Bundle;
import android.widget.Toast;
import com.google.firebase.storage.StorageReference;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: JournalTodayQuestionFragment.kt */
/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.k implements ss.l<ImageResponse, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h f30799u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(1);
        this.f30799u = hVar;
    }

    @Override // ss.l
    public final hs.k invoke(ImageResponse imageResponse) {
        ImageResponse imageResponse2 = imageResponse;
        h hVar = this.f30799u;
        try {
            if (hVar.K.size() > 0 && hVar.I >= 0) {
                ImageResponse.Pending pending = ImageResponse.Pending.INSTANCE;
                boolean b10 = kotlin.jvm.internal.i.b(imageResponse2, pending);
                ArrayList<JournalAttachImageModel> arrayList = hVar.K;
                if (b10) {
                    arrayList.get(hVar.I).setImageUploadStatus(pending);
                } else {
                    ImageResponse.UploadingStarted uploadingStarted = ImageResponse.UploadingStarted.INSTANCE;
                    String str = null;
                    if (kotlin.jvm.internal.i.b(imageResponse2, uploadingStarted)) {
                        hVar.J = true;
                        mm.b bVar = hVar.H;
                        if (bVar != null) {
                            bVar.z(hVar.I, "uploading");
                            arrayList.get(hVar.I).setImageUploadStatus(uploadingStarted);
                        } else {
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        }
                    } else if (imageResponse2 instanceof ImageResponse.Uploading) {
                        hVar.J = true;
                        mm.b bVar2 = hVar.H;
                        if (bVar2 != null) {
                            double progress = ((ImageResponse.Uploading) imageResponse2).getProgress();
                            int i6 = hVar.I;
                            Bundle bundle = new Bundle();
                            bundle.putDouble(Constants.SCREEN_PROGRESS, progress);
                            hs.k kVar = hs.k.f19476a;
                            bVar2.f2769u.d(i6, 1, bundle);
                            arrayList.get(hVar.I).setImageUploadStatus(new ImageResponse.Uploading(((ImageResponse.Uploading) imageResponse2).getProgress()));
                        } else {
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        }
                    } else {
                        int i10 = 0;
                        if (imageResponse2 instanceof ImageResponse.Success) {
                            mm.b bVar3 = hVar.H;
                            if (bVar3 != null) {
                                bVar3.y(hVar.I, ((ImageResponse.Success) imageResponse2).getImageUrl());
                                arrayList.get(hVar.I).setImageUploadStatus(new ImageResponse.Success(((ImageResponse.Success) imageResponse2).getImageUrl(), null, 2, null));
                                arrayList.get(hVar.I).setImageUploadedURL(((ImageResponse.Success) imageResponse2).getImageUrl());
                                tm.a aVar = hVar.O().A;
                                StorageReference storageRef = ((ImageResponse.Success) imageResponse2).getStorageRef();
                                if (storageRef != null) {
                                    aVar.f33283c[aVar.f33281a].add(storageRef);
                                } else {
                                    aVar.getClass();
                                }
                                hVar.J = false;
                                hVar.J();
                                String str2 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("template", hVar.O().A.b());
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
                                if (hVar.O().H && hVar.O().J != null) {
                                    JournalModel journalModel = hVar.O().J;
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
                            Toast.makeText(hVar.requireActivity(), "Image upload failed", 0).show();
                            mm.b bVar4 = hVar.H;
                            if (bVar4 != null) {
                                bVar4.z(hVar.I, "failure");
                                arrayList.get(hVar.I).setImageUploadStatus(new ImageResponse.Failure(((ImageResponse.Failure) imageResponse2).getMessage()));
                                hVar.J = false;
                                hVar.J();
                            } else {
                                kotlin.jvm.internal.i.q("adapter");
                                throw null;
                            }
                        } else if (imageResponse2 instanceof ImageResponse.Cancelled) {
                            arrayList.get(hVar.I).setImageUploadStatus(ImageResponse.Cancelled.INSTANCE);
                            hVar.F(hVar.L);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(hVar.f30800v, e10);
        }
        return hs.k.f19476a;
    }
}
