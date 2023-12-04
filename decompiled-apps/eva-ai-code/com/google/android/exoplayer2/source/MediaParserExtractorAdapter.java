package com.google.android.exoplayer2.source;

import android.media.MediaParser;
import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.source.mediaparser.InputReaderAdapterV30;
import com.google.android.exoplayer2.source.mediaparser.MediaParserUtil;
import com.google.android.exoplayer2.source.mediaparser.OutputConsumerAdapterV30;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {
    public static final ProgressiveMediaExtractor.Factory FACTORY = new ProgressiveMediaExtractor.Factory() { // from class: com.google.android.exoplayer2.source.MediaParserExtractorAdapter$$ExternalSyntheticLambda8
        @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
        public final ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
            return new MediaParserExtractorAdapter(playerId);
        }
    };
    private final InputReaderAdapterV30 inputReaderAdapter;
    private final MediaParser mediaParser;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private String parserName;

    public MediaParserExtractorAdapter(PlayerId playerId) {
        MediaParser create;
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30();
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new InputReaderAdapterV30();
        create = MediaParser.create(outputConsumerAdapterV30, new String[0]);
        this.mediaParser = create;
        create.setParameter(MediaParserUtil.PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE, true);
        create.setParameter(MediaParserUtil.PARAMETER_IN_BAND_CRYPTO_INFO, true);
        create.setParameter(MediaParserUtil.PARAMETER_INCLUDE_SUPPLEMENTAL_DATA, true);
        this.parserName = "android.media.mediaparser.UNKNOWN";
        if (Util.SDK_INT >= 31) {
            MediaParserUtil.setLogSessionIdOnMediaParser(create, playerId);
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j, long j2, ExtractorOutput extractorOutput) throws IOException {
        String parserName;
        String parserName2;
        String parserName3;
        this.outputConsumerAdapter.setExtractorOutput(extractorOutput);
        this.inputReaderAdapter.setDataReader(dataReader, j2);
        this.inputReaderAdapter.setCurrentPosition(j);
        parserName = this.mediaParser.getParserName();
        if ("android.media.mediaparser.UNKNOWN".equals(parserName)) {
            this.mediaParser.advance(this.inputReaderAdapter);
            parserName3 = this.mediaParser.getParserName();
            this.parserName = parserName3;
            this.outputConsumerAdapter.setSelectedParserName(parserName3);
        } else if (parserName.equals(this.parserName)) {
        } else {
            parserName2 = this.mediaParser.getParserName();
            this.parserName = parserName2;
            this.outputConsumerAdapter.setSelectedParserName(parserName2);
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void release() {
        this.mediaParser.release();
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.parserName)) {
            this.outputConsumerAdapter.disableSeeking();
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        return this.inputReaderAdapter.getPosition();
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void seek(long j, long j2) {
        long j3;
        this.inputReaderAdapter.setCurrentPosition(j);
        Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.outputConsumerAdapter.getSeekPoints(j2);
        MediaParser mediaParser = this.mediaParser;
        j3 = FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m6532m(seekPoints.second).position;
        mediaParser.seek(j3 == j ? FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m6532m(seekPoints.second) : FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m6532m(seekPoints.first));
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) throws IOException {
        boolean advance;
        advance = this.mediaParser.advance(this.inputReaderAdapter);
        positionHolder.position = this.inputReaderAdapter.getAndResetSeekPosition();
        if (advance) {
            return positionHolder.position != -1 ? 1 : 0;
        }
        return -1;
    }
}
