package com.carddemo.batch.job.cbtrn02c;

import com.carddemo.core.domain.DailyTransaction;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.math.BigDecimal;

public class DailyTransactionFieldSetMapper implements FieldSetMapper<DailyTransaction> {
    @Override
    public DailyTransaction mapFieldSet(FieldSet fieldSet) throws BindException {
        DailyTransaction dt = new DailyTransaction();
        dt.setDailyTransactionId(fieldSet.readString("id"));
        dt.setDailyTransactionType(fieldSet.readString("type"));
        dt.setDailyTransactionCategory(fieldSet.readInt("category"));
        dt.setDailyTransactionSource(fieldSet.readString("source"));
        dt.setDailyTransactionDescription(fieldSet.readString("desc"));
        dt.setDailyTransactionAmount(fieldSet.readBigDecimal("amount"));
        dt.setDailyTransactionMerchantId(fieldSet.readInt("merchantId"));
        dt.setDailyTransactionMerchantName(fieldSet.readString("merchantName"));
        dt.setDailyTransactionMerchantCity(fieldSet.readString("merchantCity"));
        dt.setDailyTransactionMerchantZip(fieldSet.readString("merchantZip"));
        dt.setDailyTransactionCardNumber(fieldSet.readString("cardNumber"));
        dt.setDailyTransactionOriginalTimestamp(fieldSet.readString("origTs"));
        dt.setDailyTransactionProcessTimestamp(fieldSet.readString("procTs"));
        dt.setValidationStatus("PENDING");
        return dt;
    }
}
