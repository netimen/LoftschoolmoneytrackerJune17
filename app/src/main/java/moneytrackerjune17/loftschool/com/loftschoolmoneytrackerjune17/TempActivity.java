package moneytrackerjune17.loftschool.com.loftschoolmoneytrackerjune17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class TempActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView add = (TextView) findViewById(R.id.add);
        final EditText name = (EditText) findViewById(R.id.name);
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                add.setEnabled(!TextUtils.isEmpty(s));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}

//class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {
//
//    private List<Item> items = new ArrayList<>();
//
//    @Override
//    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null));
//    }
//
//    @Override
//    public void onBindViewHolder(ItemViewHolder holder, int position) {
//        final Item item = items.get(position);
//        holder.name.setText(item.name);
//        holder.price.setText(holder.itemView.getContext().getString(R.string.price, item.price));
//    }
//
//    @Override
//    public int getItemCount() {
//        return items.size();
//    }
//
//    void add(Item item) {
//        items.add(0, item);
//        notifyItemInserted(0);
//    }
//
//    static class ItemViewHolder extends RecyclerView.ViewHolder {
//
//        private final TextView name, price;
//
//        ItemViewHolder(View itemView) {
//            super(itemView);
//            name = (TextView) itemView.findViewById(R.id.name);
//            price = (TextView) itemView.findViewById(R.id.price);
//        }
//    }
//}

//<RelativeLayout
//        android:id="@+id/item_container"
//                android:layout_width="match_parent"
//                android:layout_height="wrap_content"
//                android:background="@drawable/bg_item">
//
//<TextView
//            android:id="@+id/name"
//                    style="@style/Text.Item"
//                    android:layout_alignParentStart="true"
//                    android:layout_toStartOf="@+id/price" />
//
//<TextView
//            android:id="@+id/price"
//                    style="@style/Text.Item"
//                    android:layout_alignParentEnd="true"
//                    android:background="@color/colorShadow"
//                    android:textStyle="bold" />
//</RelativeLayout>

//<selector xmlns:android="http://schemas.android.com/apk/res/android">
//<item android:drawable="@color/colorItemSelected" android:state_activated="true" />
//<item android:drawable="@color/colorItem" />
//</selector>

//<style name="Text.Item" parent="">
//<item name="android:layout_width">wrap_content</item>
//<item name="android:layout_height">wrap_content</item>
//<item name="android:padding">@dimen/margin_large</item>
//<item name="android:textColor">@color/colorActive</item>
//<item name="android:textSize">@dimen/text_item</item>
//</style>
