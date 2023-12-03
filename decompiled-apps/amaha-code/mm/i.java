package mm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.model.JournalThoughtThinkingItemListModel;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.t;
import dl.l0;
import g0.a;
import hs.k;
import java.util.ArrayList;
import java.util.List;
import ss.l;
import ss.p;
/* compiled from: JournalThoughtThinkingListAdapter.kt */
/* loaded from: classes2.dex */
public final class i extends RecyclerView.e<a> {
    public final p<JournalThoughtThinkingItemListModel, Boolean, k> A;
    public final l<JournalThoughtThinkingItemListModel, k> B;
    public final boolean C;
    public final String D;

    /* renamed from: x  reason: collision with root package name */
    public final List<JournalThoughtThinkingItemListModel> f25636x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<JournalThoughtThinkingItemListModel> f25637y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f25638z;

    /* compiled from: JournalThoughtThinkingListAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public i(List list, ArrayList selectedOptionList, androidx.fragment.app.p pVar, p onOptionClick, l onExpandClick, boolean z10) {
        kotlin.jvm.internal.i.g(selectedOptionList, "selectedOptionList");
        kotlin.jvm.internal.i.g(onOptionClick, "onOptionClick");
        kotlin.jvm.internal.i.g(onExpandClick, "onExpandClick");
        this.f25636x = list;
        this.f25637y = selectedOptionList;
        this.f25638z = pVar;
        this.A = onOptionClick;
        this.B = onExpandClick;
        this.C = z10;
        this.D = LogHelper.INSTANCE.makeLogTag("JournalThoughtThinkingListAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f25636x.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x013d A[Catch: Exception -> 0x01f3, TryCatch #0 {Exception -> 0x01f3, blocks: (B:3:0x0006, B:5:0x001a, B:7:0x0020, B:9:0x002e, B:11:0x0034, B:13:0x0040, B:15:0x004d, B:18:0x0055, B:19:0x0059, B:20:0x005c, B:55:0x00db, B:76:0x011f, B:78:0x013d, B:80:0x0145, B:83:0x01a5, B:85:0x01ab, B:86:0x01b6, B:87:0x01bf, B:81:0x016f, B:88:0x01d9, B:59:0x00e8, B:63:0x00f5, B:67:0x0102, B:71:0x010f, B:22:0x0061, B:26:0x0070, B:30:0x007f, B:34:0x008e, B:38:0x009d, B:42:0x00ac, B:46:0x00bb, B:50:0x00c8, B:54:0x00d5), top: B:93:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d9 A[Catch: Exception -> 0x01f3, TRY_LEAVE, TryCatch #0 {Exception -> 0x01f3, blocks: (B:3:0x0006, B:5:0x001a, B:7:0x0020, B:9:0x002e, B:11:0x0034, B:13:0x0040, B:15:0x004d, B:18:0x0055, B:19:0x0059, B:20:0x005c, B:55:0x00db, B:76:0x011f, B:78:0x013d, B:80:0x0145, B:83:0x01a5, B:85:0x01ab, B:86:0x01b6, B:87:0x01bf, B:81:0x016f, B:88:0x01d9, B:59:0x00e8, B:63:0x00f5, B:67:0x0102, B:71:0x010f, B:22:0x0061, B:26:0x0070, B:30:0x007f, B:34:0x008e, B:38:0x009d, B:42:0x00ac, B:46:0x00bb, B:50:0x00c8, B:54:0x00d5), top: B:93:0x0006 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        String str2;
        int i10;
        String descriptionText;
        a aVar2 = aVar;
        Context context = this.f25638z;
        View view = aVar2.f2751a;
        try {
            JournalThoughtThinkingItemListModel journalThoughtThinkingItemListModel = this.f25636x.get(i6);
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvJournalThoughtThinkingRowTitle);
            if (journalThoughtThinkingItemListModel != null) {
                str = journalThoughtThinkingItemListModel.getHeader();
            } else {
                str = null;
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvJournalThoughtThinkingRowDescription);
            if (journalThoughtThinkingItemListModel != null && (descriptionText = journalThoughtThinkingItemListModel.getDescriptionText()) != null) {
                spannableStringBuilder = ca.a.g0(15, ca.a.Z(descriptionText));
            } else {
                spannableStringBuilder = null;
            }
            robertoTextView2.setText(spannableStringBuilder);
            com.bumptech.glide.e<Bitmap> a10 = Glide.g(context).a();
            if (journalThoughtThinkingItemListModel != null) {
                str2 = journalThoughtThinkingItemListModel.getId();
            } else {
                str2 = null;
            }
            if (str2 != null) {
                int hashCode = str2.hashCode();
                switch (hashCode) {
                    case 48626:
                        str2.equals("101");
                        break;
                    case 48627:
                        if (!str2.equals("102")) {
                            break;
                        } else {
                            i10 = R.drawable.ic_thinking_style_2;
                            break;
                        }
                    case 48628:
                        if (!str2.equals("103")) {
                            break;
                        } else {
                            i10 = R.drawable.ic_thinking_style_3;
                            break;
                        }
                    case 48629:
                        if (!str2.equals("104")) {
                            break;
                        } else {
                            i10 = R.drawable.ic_thinking_style_4;
                            break;
                        }
                    case 48630:
                        if (!str2.equals("105")) {
                            break;
                        } else {
                            i10 = R.drawable.ic_thinking_style_5;
                            break;
                        }
                    case 48631:
                        if (!str2.equals("106")) {
                            break;
                        } else {
                            i10 = R.drawable.ic_thinking_style_6;
                            break;
                        }
                    case 48632:
                        if (!str2.equals("107")) {
                            break;
                        } else {
                            i10 = R.drawable.ic_thinking_style_7;
                            break;
                        }
                    case 48633:
                        if (!str2.equals("108")) {
                            break;
                        } else {
                            i10 = R.drawable.ic_thinking_style_8;
                            break;
                        }
                    case 48634:
                        if (!str2.equals("109")) {
                            break;
                        } else {
                            i10 = R.drawable.ic_thinking_style_9;
                            break;
                        }
                    default:
                        switch (hashCode) {
                            case 48656:
                                if (!str2.equals("110")) {
                                    break;
                                } else {
                                    i10 = R.drawable.ic_thinking_style_10;
                                    break;
                                }
                            case 48657:
                                if (!str2.equals("111")) {
                                    break;
                                } else {
                                    i10 = R.drawable.ic_thinking_style_11;
                                    break;
                                }
                            case 48658:
                                if (!str2.equals("112")) {
                                    break;
                                } else {
                                    i10 = R.drawable.ic_thinking_style_12;
                                    break;
                                }
                            case 48659:
                                if (!str2.equals("113")) {
                                    break;
                                } else {
                                    i10 = R.drawable.ic_thinking_style_13;
                                    break;
                                }
                            case 48660:
                                if (!str2.equals("114")) {
                                    break;
                                } else {
                                    i10 = R.drawable.ic_thinking_style_14;
                                    break;
                                }
                        }
                }
                a10.C(Integer.valueOf(i10)).B((AppCompatImageView) view.findViewById(R.id.ivJournalThoughtThinkingRow));
                if (this.C) {
                    boolean contains = this.f25637y.contains(journalThoughtThinkingItemListModel);
                    if (contains) {
                        ((MotionLayout) view.findViewById(R.id.mlJournalThoughtThinkingParentContainer)).setBackgroundColor(g0.a.b(context, R.color.amahaLightGreen));
                        ((AppCompatImageView) view.findViewById(R.id.ivJournalThoughtThinkingRowCheckbox)).setImageDrawable(a.c.b(context, R.drawable.ic_checkbox_amaha_green));
                        ((AppCompatImageView) view.findViewById(R.id.ivJournalThoughtThinkingRowCheckbox)).setImageTintList(null);
                    } else {
                        ((MotionLayout) view.findViewById(R.id.mlJournalThoughtThinkingParentContainer)).setBackgroundColor(g0.a.b(context, R.color.white));
                        ((AppCompatImageView) view.findViewById(R.id.ivJournalThoughtThinkingRowCheckbox)).setImageDrawable(a.c.b(context, R.drawable.ic_check_box_outline_blank_blue_24dp));
                        ((AppCompatImageView) view.findViewById(R.id.ivJournalThoughtThinkingRowCheckbox)).setImageTintList(ColorStateList.valueOf(g0.a.b(context, R.color.amahaGreen)));
                    }
                    if (journalThoughtThinkingItemListModel != null) {
                        if (journalThoughtThinkingItemListModel.isExpanded()) {
                            ((MotionLayout) view.findViewById(R.id.mlJournalThoughtThinkingParentContainer)).m(0.0f);
                        } else {
                            ((MotionLayout) view.findViewById(R.id.mlJournalThoughtThinkingParentContainer)).A();
                        }
                    }
                    ((AppCompatImageView) view.findViewById(R.id.ivJournalThoughtThinkingRowCheckbox)).setOnClickListener(new l0(4, journalThoughtThinkingItemListModel, this, contains));
                    view.setOnClickListener(new t(27, journalThoughtThinkingItemListModel, aVar2, this));
                    return;
                }
                Extensions extensions = Extensions.INSTANCE;
                AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.ivJournalThoughtThinkingRowCheckbox);
                kotlin.jvm.internal.i.f(appCompatImageView, "holder.itemView.ivJourna…houghtThinkingRowCheckbox");
                extensions.gone(appCompatImageView);
                ((MotionLayout) view.findViewById(R.id.mlJournalThoughtThinkingParentContainer)).A();
                return;
            }
            i10 = R.drawable.ic_thinking_style_1;
            a10.C(Integer.valueOf(i10)).B((AppCompatImageView) view.findViewById(R.id.ivJournalThoughtThinkingRow));
            if (this.C) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.D, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        a aVar = new a(defpackage.e.h(parent, R.layout.row_journal_thought_thinking_list_view, parent, false, "from(parent.context)\n   …list_view, parent, false)"));
        aVar.s(false);
        return aVar;
    }
}
