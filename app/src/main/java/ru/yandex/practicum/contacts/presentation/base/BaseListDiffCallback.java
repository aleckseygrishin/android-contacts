package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback <F extends ListDiffInterface> extends DiffUtil.ItemCallback<F> {

    @Override
    public boolean areItemsTheSame(@NonNull F oldItem, @NonNull F newItem) {
        return oldItem.theSameAs(this) == newItem.theSameAs(this);
    }

    @Override
    public boolean areContentsTheSame(@NonNull F oldItem, @NonNull F newItem) {
        return oldItem.theSameAs(this) == newItem.theSameAs(this);
    }

}
