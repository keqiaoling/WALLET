package com.example.myapplication.begin.edit;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.example.myapplication.R;


public class PaypassView extends RelativeLayout {
    private EditText editText;
    private ImageView[] textViews;
    private static int MAX = 6;
    private String inputContent;


    public PaypassView(Context context) {
        this(context, null);
    }

    public PaypassView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PaypassView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View.inflate(context, R.layout.paypass_code, this);

        textViews = new ImageView[MAX];
        textViews[0] = (ImageView) findViewById(R.id.tv_0);
        textViews[1] = (ImageView) findViewById(R.id.tv_1);
        textViews[2] = (ImageView) findViewById(R.id.tv_2);
        textViews[3] = (ImageView) findViewById(R.id.tv_3);
        textViews[4] = (ImageView) findViewById(R.id.tv_4);
        textViews[5] = (ImageView) findViewById(R.id.tv_5);


        editText = (EditText) findViewById(R.id.edit_text_view);

        editText.setCursorVisible(false);//隐藏光标
        setEditTextListener();
    }

    private void setEditTextListener() {
        editText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                inputContent = editText.getText().toString();

                if (inputCompleteListener != null) {
                    if (inputContent.length() >= MAX) {
                        inputCompleteListener.inputComplete();
                    } else {
                        inputCompleteListener.invalidContent();
                    }
                }

                for (int i = 0; i < MAX; i++) {
                    if (i < inputContent.length()) {
                        textViews[i].setImageResource(R.drawable.lanse_pay_bg);
                    } else {
                        textViews[i].setImageResource(R.drawable.paypass_bg);
                    }
                }
            }
        });
    }


    private InputCompleteListener inputCompleteListener;

    public void setInputCompleteListener(InputCompleteListener inputCompleteListener) {
        this.inputCompleteListener = inputCompleteListener;
    }

    public interface InputCompleteListener {

        void inputComplete();

        void invalidContent();
    }

    public String getEditContent() {
        return inputContent;
    }

}