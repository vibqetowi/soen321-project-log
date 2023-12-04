package io.opencensus.metrics;

import io.opencensus.common.ToDoubleFunction;
import io.opencensus.internal.Utils;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class DerivedDoubleCumulative {
    public abstract void clear();

    public abstract <T> void createTimeSeries(List<LabelValue> list, T t, ToDoubleFunction<T> toDoubleFunction);

    public abstract void removeTimeSeries(List<LabelValue> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DerivedDoubleCumulative newNoopDerivedDoubleCumulative(String str, String str2, String str3, List<LabelKey> list) {
        return NoopDerivedDoubleCumulative.create(str, str2, str3, list);
    }

    /* loaded from: classes4.dex */
    private static final class NoopDerivedDoubleCumulative extends DerivedDoubleCumulative {
        private final int labelKeysSize;

        @Override // io.opencensus.metrics.DerivedDoubleCumulative
        public void clear() {
        }

        static NoopDerivedDoubleCumulative create(String str, String str2, String str3, List<LabelKey> list) {
            return new NoopDerivedDoubleCumulative(str, str2, str3, list);
        }

        NoopDerivedDoubleCumulative(String str, String str2, String str3, List<LabelKey> list) {
            Utils.checkNotNull(str, "name");
            Utils.checkNotNull(str2, "description");
            Utils.checkNotNull(str3, "unit");
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelKeys"), "labelKey");
            this.labelKeysSize = list.size();
        }

        @Override // io.opencensus.metrics.DerivedDoubleCumulative
        public <T> void createTimeSeries(List<LabelValue> list, T t, ToDoubleFunction<T> toDoubleFunction) {
            Utils.checkListElementNotNull((List) Utils.checkNotNull(list, "labelValues"), "labelValue");
            Utils.checkArgument(this.labelKeysSize == list.size(), "Label Keys and Label Values don't have same size.");
            Utils.checkNotNull(toDoubleFunction, "function");
        }

        @Override // io.opencensus.metrics.DerivedDoubleCumulative
        public void removeTimeSeries(List<LabelValue> list) {
            Utils.checkNotNull(list, "labelValues");
        }
    }
}
