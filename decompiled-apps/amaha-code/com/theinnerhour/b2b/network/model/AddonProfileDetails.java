package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: ProviderDetailHolderModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R2\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/theinnerhour/b2b/network/model/AddonProfileDetails;", "", "testimonials", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/network/model/Testimonials;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getTestimonials", "()Ljava/util/ArrayList;", "setTestimonials", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class AddonProfileDetails {
    @b("testimonials")
    private ArrayList<Testimonials> testimonials;

    public AddonProfileDetails() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddonProfileDetails copy$default(AddonProfileDetails addonProfileDetails, ArrayList arrayList, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            arrayList = addonProfileDetails.testimonials;
        }
        return addonProfileDetails.copy(arrayList);
    }

    public final ArrayList<Testimonials> component1() {
        return this.testimonials;
    }

    public final AddonProfileDetails copy(ArrayList<Testimonials> arrayList) {
        return new AddonProfileDetails(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AddonProfileDetails) && i.b(this.testimonials, ((AddonProfileDetails) obj).testimonials)) {
            return true;
        }
        return false;
    }

    public final ArrayList<Testimonials> getTestimonials() {
        return this.testimonials;
    }

    public int hashCode() {
        ArrayList<Testimonials> arrayList = this.testimonials;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setTestimonials(ArrayList<Testimonials> arrayList) {
        this.testimonials = arrayList;
    }

    public String toString() {
        return "AddonProfileDetails(testimonials=" + this.testimonials + ')';
    }

    public AddonProfileDetails(ArrayList<Testimonials> arrayList) {
        this.testimonials = arrayList;
    }

    public /* synthetic */ AddonProfileDetails(ArrayList arrayList, int i6, d dVar) {
        this((i6 & 1) != 0 ? new ArrayList() : arrayList);
    }
}
