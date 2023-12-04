package com.ifriend.ui.premiumAdvantages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.UIUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
/* compiled from: ExpandableAdvantagesListView.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020*H\u0002J\b\u0010.\u001a\u00020*H\u0002J\u0006\u0010/\u001a\u00020*J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001bH\u0002J\u0006\u00103\u001a\u00020*J\b\u00104\u001a\u00020*H\u0002R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ifriend/ui/premiumAdvantages/ExpandableAdvantagesListView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", TtmlNode.RUBY_CONTAINER, "Landroid/widget/LinearLayout;", "getContainer", "()Landroid/widget/LinearLayout;", "container$delegate", "Lkotlin/Lazy;", "isExpanded", "", "()Z", "setExpanded", "(Z)V", "<set-?>", "isPossibleToExpand", "isRainbowCheck", FirebaseAnalytics.Param.ITEMS, "", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "maxItemsIfThereAreExpandButton", "getMaxItemsIfThereAreExpandButton", "()I", "setMaxItemsIfThereAreExpandButton", "(I)V", "maxItemsWithoutExpandButton", "getMaxItemsWithoutExpandButton", "setMaxItemsWithoutExpandButton", "showItems", "addMissingItems", "", "createShowMoreView", "Landroid/widget/TextView;", "drawState", "removeExpandView", "setRainbowCheck", "toView", "Landroid/view/View;", "text", "updateState", "updateTexts", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExpandableAdvantagesListView extends FrameLayout {
    private static final int DEFAULT_MAX_ITEMS_IF_THERE_ARE_EXPAND_BUTTON = 2;
    private static final int DEFAULT_MAX_ITEMS_WITHOUT_EXPAND_BUTTON = 4;
    private static final String EXPAND_VIEW_TAG = "EXPAND_VIEW";
    private static final float EXPAND_VIEW_TEXT_SIZE = 16.0f;
    public static final int NO_LIMITS_MAX_ITEMS = Integer.MAX_VALUE;
    private static final int VERTICAL_PADDING_BETWEEN_ITEMS = 8;
    private final Lazy container$delegate;
    private boolean isExpanded;
    private boolean isPossibleToExpand;
    private boolean isRainbowCheck;
    private List<String> items;
    private int maxItemsIfThereAreExpandButton;
    private int maxItemsWithoutExpandButton;
    private List<String> showItems;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableAdvantagesListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout.inflate(context, R.layout.expandable_advantages_list_view, this);
        this.container$delegate = LazyKt.lazy(new ExpandableAdvantagesListView$container$2(this));
        this.showItems = CollectionsKt.emptyList();
        this.maxItemsWithoutExpandButton = 4;
        this.maxItemsIfThereAreExpandButton = 2;
        this.items = CollectionsKt.emptyList();
    }

    /* compiled from: ExpandableAdvantagesListView.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/ui/premiumAdvantages/ExpandableAdvantagesListView$Companion;", "", "()V", "DEFAULT_MAX_ITEMS_IF_THERE_ARE_EXPAND_BUTTON", "", "DEFAULT_MAX_ITEMS_WITHOUT_EXPAND_BUTTON", "EXPAND_VIEW_TAG", "", "EXPAND_VIEW_TEXT_SIZE", "", "NO_LIMITS_MAX_ITEMS", "VERTICAL_PADDING_BETWEEN_ITEMS", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableAdvantagesListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableAdvantagesListView(Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LinearLayout getContainer() {
        Object value = this.container$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final int getMaxItemsWithoutExpandButton() {
        return this.maxItemsWithoutExpandButton;
    }

    public final void setMaxItemsWithoutExpandButton(int i) {
        this.maxItemsWithoutExpandButton = i;
    }

    public final int getMaxItemsIfThereAreExpandButton() {
        return this.maxItemsIfThereAreExpandButton;
    }

    public final void setMaxItemsIfThereAreExpandButton(int i) {
        this.maxItemsIfThereAreExpandButton = i;
    }

    public final List<String> getItems() {
        return this.items;
    }

    public final void setItems(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public final boolean isPossibleToExpand() {
        return this.isPossibleToExpand;
    }

    public final void updateState() {
        if (this.isExpanded) {
            this.showItems = this.items;
            this.isPossibleToExpand = false;
        } else {
            int size = this.items.size();
            int i = this.maxItemsWithoutExpandButton;
            boolean z = size >= i;
            this.isPossibleToExpand = z;
            if (z) {
                i = this.maxItemsIfThereAreExpandButton;
            }
            this.showItems = CollectionsKt.take(this.items, i);
        }
        drawState();
    }

    public final void setRainbowCheck() {
        this.isRainbowCheck = true;
    }

    private final void drawState() {
        removeExpandView();
        addMissingItems();
        updateTexts();
        if (this.isPossibleToExpand) {
            getContainer().addView(createShowMoreView());
        }
    }

    private final void updateTexts() {
        int i = 0;
        for (Object obj : SequencesKt.filterIsInstance(ViewGroupKt.getChildren(getContainer()), AdvantageView.class)) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AdvantageView advantageView = (AdvantageView) obj;
            String text = advantageView.getText();
            String str = this.items.get(i);
            if (!Intrinsics.areEqual(text, str)) {
                advantageView.setText(str);
            }
            i = i2;
        }
    }

    private final void addMissingItems() {
        int i = 0;
        for (View view : ViewGroupKt.getChildren(getContainer())) {
            if ((view instanceof AdvantageView) && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        List<String> list = this.showItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            arrayList.add(toView(str));
        }
        LinearLayout container = getContainer();
        for (View view2 : CollectionsKt.takeLast(arrayList, this.items.size() - i)) {
            container.addView(view2);
        }
    }

    private final void removeExpandView() {
        Iterator<View> it = ViewGroupKt.getChildren(getContainer()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            View next = it.next();
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(next.getTag(), EXPAND_VIEW_TAG)) {
                break;
            }
            i++;
        }
        if (i != -1) {
            getContainer().removeViewAt(i);
        }
    }

    private final View toView(String str) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AdvantageView advantageView = new AdvantageView(context);
        advantageView.setText(str);
        advantageView.setPadding(0, 0, 0, (int) UIUtils.INSTANCE.getToPx((Number) 8));
        advantageView.setRainbowCheck(this.isRainbowCheck);
        return advantageView;
    }

    private final TextView createShowMoreView() {
        TextView textView = new TextView(getContext());
        textView.setTag(EXPAND_VIEW_TAG);
        textView.setText(textView.getContext().getString(R.string.show_more_features));
        textView.setTextColor(textView.getContext().getColor(R.color.text_accent));
        textView.setTextSize(16.0f);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.premiumAdvantages.ExpandableAdvantagesListView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpandableAdvantagesListView.createShowMoreView$lambda$6(ExpandableAdvantagesListView.this, view);
            }
        });
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createShowMoreView$lambda$6(ExpandableAdvantagesListView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isExpanded = true;
        this$0.updateState();
    }
}
