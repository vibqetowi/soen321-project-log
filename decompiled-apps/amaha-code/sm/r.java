package sm;

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
/* compiled from: JournalThoughtDescriptionFragment.kt */
/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.k implements ss.l<ImageResponse, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f31734u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(1);
        this.f31734u = sVar;
    }

    @Override // ss.l
    public final hs.k invoke(ImageResponse imageResponse) {
        ImageResponse imageResponse2 = imageResponse;
        s sVar = this.f31734u;
        try {
            if (sVar.H.size() > 0 && sVar.F >= 0) {
                ImageResponse.Pending pending = ImageResponse.Pending.INSTANCE;
                boolean b10 = kotlin.jvm.internal.i.b(imageResponse2, pending);
                ArrayList<JournalAttachImageModel> arrayList = sVar.H;
                if (b10) {
                    arrayList.get(sVar.F).setImageUploadStatus(pending);
                } else {
                    ImageResponse.UploadingStarted uploadingStarted = ImageResponse.UploadingStarted.INSTANCE;
                    String str = null;
                    if (kotlin.jvm.internal.i.b(imageResponse2, uploadingStarted)) {
                        sVar.G = true;
                        mm.b bVar = sVar.E;
                        if (bVar != null) {
                            bVar.z(sVar.F, "uploading");
                            arrayList.get(sVar.F).setImageUploadStatus(uploadingStarted);
                        } else {
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        }
                    } else if (imageResponse2 instanceof ImageResponse.Uploading) {
                        arrayList.get(sVar.F).setImageUploadStatus(new ImageResponse.Uploading(((ImageResponse.Uploading) imageResponse2).getProgress()));
                        sVar.G = true;
                        mm.b bVar2 = sVar.E;
                        if (bVar2 != null) {
                            double progress = ((ImageResponse.Uploading) imageResponse2).getProgress();
                            int i6 = sVar.F;
                            Bundle bundle = new Bundle();
                            bundle.putDouble(Constants.SCREEN_PROGRESS, progress);
                            hs.k kVar = hs.k.f19476a;
                            bVar2.f2769u.d(i6, 1, bundle);
                        } else {
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        }
                    } else {
                        int i10 = 0;
                        if (imageResponse2 instanceof ImageResponse.Success) {
                            mm.b bVar3 = sVar.E;
                            if (bVar3 != null) {
                                bVar3.y(sVar.F, ((ImageResponse.Success) imageResponse2).getImageUrl());
                                arrayList.get(sVar.F).setImageUploadStatus(new ImageResponse.Success(((ImageResponse.Success) imageResponse2).getImageUrl(), null, 2, null));
                                arrayList.get(sVar.F).setImageUploadedURL(((ImageResponse.Success) imageResponse2).getImageUrl());
                                tm.a aVar = sVar.O().A;
                                StorageReference storageRef = ((ImageResponse.Success) imageResponse2).getStorageRef();
                                if (storageRef != null) {
                                    aVar.f33283c[aVar.f33281a].add(storageRef);
                                } else {
                                    aVar.getClass();
                                }
                                sVar.G = false;
                                sVar.J();
                                String str2 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("template", sVar.O().A.b());
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
                                bundle2.putInt("step", sVar.f31737x + 1);
                                if (sVar.O().H && sVar.O().J != null) {
                                    JournalModel journalModel = sVar.O().J;
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
                            Toast.makeText(sVar.requireActivity(), "Image upload failed", 0).show();
                            mm.b bVar4 = sVar.E;
                            if (bVar4 != null) {
                                bVar4.z(sVar.F, "failure");
                                arrayList.get(sVar.F).setImageUploadStatus(new ImageResponse.Failure(((ImageResponse.Failure) imageResponse2).getMessage()));
                                sVar.G = false;
                                sVar.J();
                            } else {
                                kotlin.jvm.internal.i.q("adapter");
                                throw null;
                            }
                        } else if (imageResponse2 instanceof ImageResponse.Cancelled) {
                            arrayList.get(sVar.F).setImageUploadStatus(ImageResponse.Cancelled.INSTANCE);
                            sVar.F(sVar.I);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(sVar.f31735v, e10);
        }
        return hs.k.f19476a;
    }
}
