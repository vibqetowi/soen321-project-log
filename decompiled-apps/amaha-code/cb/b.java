package cb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.theinnerhour.b2b.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import qb.t;
import ub.d;
import ug.l;
/* compiled from: BadgeState.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f5231a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5232b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final float f5233c;

    /* renamed from: d  reason: collision with root package name */
    public final float f5234d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5235e;

    public b(Context context, a aVar) {
        a aVar2;
        AttributeSet attributeSet;
        int i6;
        int i10;
        boolean z10;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        Locale locale;
        Locale.Category category;
        int next;
        if (aVar == null) {
            aVar2 = new a();
        } else {
            aVar2 = aVar;
        }
        int i11 = aVar2.f5236u;
        if (i11 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i11);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        i6 = asAttributeSet.getStyleAttribute();
                        attributeSet = asAttributeSet;
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i11));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i6 = 0;
        }
        if (i6 == 0) {
            i10 = 2132083798;
        } else {
            i10 = i6;
        }
        TypedArray d10 = t.d(context, attributeSet, l.f34122d, R.attr.badgeStyle, i10, new int[0]);
        Resources resources = context.getResources();
        this.f5233c = d10.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.f5235e = d10.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f5234d = d10.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        a aVar3 = this.f5232b;
        int i12 = aVar2.f5239x;
        aVar3.f5239x = i12 == -2 ? 255 : i12;
        CharSequence charSequence = aVar2.B;
        aVar3.B = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        a aVar4 = this.f5232b;
        int i13 = aVar2.C;
        aVar4.C = i13 == 0 ? R.plurals.mtrl_badge_content_description : i13;
        int i14 = aVar2.D;
        aVar4.D = i14 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i14;
        Boolean bool = aVar2.F;
        if (bool != null && !bool.booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        aVar4.F = Boolean.valueOf(z10);
        a aVar5 = this.f5232b;
        int i15 = aVar2.f5241z;
        aVar5.f5241z = i15 == -2 ? d10.getInt(8, 4) : i15;
        int i16 = aVar2.f5240y;
        if (i16 != -2) {
            this.f5232b.f5240y = i16;
        } else if (d10.hasValue(9)) {
            this.f5232b.f5240y = d10.getInt(9, 0);
        } else {
            this.f5232b.f5240y = -1;
        }
        a aVar6 = this.f5232b;
        Integer num = aVar2.f5237v;
        if (num == null) {
            intValue = d.a(context, d10, 0).getDefaultColor();
        } else {
            intValue = num.intValue();
        }
        aVar6.f5237v = Integer.valueOf(intValue);
        Integer num2 = aVar2.f5238w;
        if (num2 != null) {
            this.f5232b.f5238w = num2;
        } else if (d10.hasValue(3)) {
            this.f5232b.f5238w = Integer.valueOf(d.a(context, d10, 3).getDefaultColor());
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132083280, l.N);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList a10 = d.a(context, obtainStyledAttributes, 3);
            d.a(context, obtainStyledAttributes, 4);
            d.a(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i17 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i17, 0);
            obtainStyledAttributes.getString(i17);
            obtainStyledAttributes.getBoolean(14, false);
            d.a(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(2132083280, l.f34142z);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f5232b.f5238w = Integer.valueOf(a10.getDefaultColor());
        }
        a aVar7 = this.f5232b;
        Integer num3 = aVar2.E;
        if (num3 == null) {
            intValue2 = d10.getInt(1, 8388661);
        } else {
            intValue2 = num3.intValue();
        }
        aVar7.E = Integer.valueOf(intValue2);
        a aVar8 = this.f5232b;
        Integer num4 = aVar2.G;
        if (num4 == null) {
            intValue3 = d10.getDimensionPixelOffset(6, 0);
        } else {
            intValue3 = num4.intValue();
        }
        aVar8.G = Integer.valueOf(intValue3);
        a aVar9 = this.f5232b;
        Integer num5 = aVar2.H;
        if (num5 == null) {
            intValue4 = d10.getDimensionPixelOffset(10, 0);
        } else {
            intValue4 = num5.intValue();
        }
        aVar9.H = Integer.valueOf(intValue4);
        a aVar10 = this.f5232b;
        Integer num6 = aVar2.I;
        if (num6 == null) {
            intValue5 = d10.getDimensionPixelOffset(7, aVar10.G.intValue());
        } else {
            intValue5 = num6.intValue();
        }
        aVar10.I = Integer.valueOf(intValue5);
        a aVar11 = this.f5232b;
        Integer num7 = aVar2.J;
        if (num7 == null) {
            intValue6 = d10.getDimensionPixelOffset(11, aVar11.H.intValue());
        } else {
            intValue6 = num7.intValue();
        }
        aVar11.J = Integer.valueOf(intValue6);
        a aVar12 = this.f5232b;
        Integer num8 = aVar2.K;
        if (num8 == null) {
            intValue7 = 0;
        } else {
            intValue7 = num8.intValue();
        }
        aVar12.K = Integer.valueOf(intValue7);
        a aVar13 = this.f5232b;
        Integer num9 = aVar2.L;
        aVar13.L = Integer.valueOf(num9 != null ? num9.intValue() : 0);
        d10.recycle();
        Locale locale2 = aVar2.A;
        if (locale2 == null) {
            a aVar14 = this.f5232b;
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            aVar14.A = locale;
        } else {
            this.f5232b.A = locale2;
        }
        this.f5231a = aVar2;
    }

    /* compiled from: BadgeState.java */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0107a();
        public Locale A;
        public CharSequence B;
        public int C;
        public int D;
        public Integer E;
        public Boolean F;
        public Integer G;
        public Integer H;
        public Integer I;
        public Integer J;
        public Integer K;
        public Integer L;

        /* renamed from: u  reason: collision with root package name */
        public int f5236u;

        /* renamed from: v  reason: collision with root package name */
        public Integer f5237v;

        /* renamed from: w  reason: collision with root package name */
        public Integer f5238w;

        /* renamed from: x  reason: collision with root package name */
        public int f5239x;

        /* renamed from: y  reason: collision with root package name */
        public int f5240y;

        /* renamed from: z  reason: collision with root package name */
        public int f5241z;

        /* compiled from: BadgeState.java */
        /* renamed from: cb.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0107a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i6) {
                return new a[i6];
            }
        }

        public a() {
            this.f5239x = 255;
            this.f5240y = -2;
            this.f5241z = -2;
            this.F = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            String charSequence;
            parcel.writeInt(this.f5236u);
            parcel.writeSerializable(this.f5237v);
            parcel.writeSerializable(this.f5238w);
            parcel.writeInt(this.f5239x);
            parcel.writeInt(this.f5240y);
            parcel.writeInt(this.f5241z);
            CharSequence charSequence2 = this.B;
            if (charSequence2 == null) {
                charSequence = null;
            } else {
                charSequence = charSequence2.toString();
            }
            parcel.writeString(charSequence);
            parcel.writeInt(this.C);
            parcel.writeSerializable(this.E);
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.H);
            parcel.writeSerializable(this.I);
            parcel.writeSerializable(this.J);
            parcel.writeSerializable(this.K);
            parcel.writeSerializable(this.L);
            parcel.writeSerializable(this.F);
            parcel.writeSerializable(this.A);
        }

        public a(Parcel parcel) {
            this.f5239x = 255;
            this.f5240y = -2;
            this.f5241z = -2;
            this.F = Boolean.TRUE;
            this.f5236u = parcel.readInt();
            this.f5237v = (Integer) parcel.readSerializable();
            this.f5238w = (Integer) parcel.readSerializable();
            this.f5239x = parcel.readInt();
            this.f5240y = parcel.readInt();
            this.f5241z = parcel.readInt();
            this.B = parcel.readString();
            this.C = parcel.readInt();
            this.E = (Integer) parcel.readSerializable();
            this.G = (Integer) parcel.readSerializable();
            this.H = (Integer) parcel.readSerializable();
            this.I = (Integer) parcel.readSerializable();
            this.J = (Integer) parcel.readSerializable();
            this.K = (Integer) parcel.readSerializable();
            this.L = (Integer) parcel.readSerializable();
            this.F = (Boolean) parcel.readSerializable();
            this.A = (Locale) parcel.readSerializable();
        }
    }
}
