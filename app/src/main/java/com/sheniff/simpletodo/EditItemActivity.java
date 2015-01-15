package com.sheniff.simpletodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class EditItemActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        EditText editedItem = (EditText) findViewById(R.id.updateItemEditText);
        editedItem.setText(getIntent().getStringExtra("itemName"));
        editedItem.setSelection(editedItem.getText().length());
    }


    public void onSaveClick(View view) {
        Intent response = new Intent();
        EditText editedItem = (EditText) findViewById(R.id.updateItemEditText);
        response.putExtra("newItemName", editedItem.getText().toString());
        response.putExtra("itemPosition", getIntent().getExtras().getInt("itemPosition"));
        setResult(RESULT_OK, response);
        this.finish();
    }
}
