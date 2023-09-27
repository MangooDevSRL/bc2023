import { ITransaction } from 'app/shared/model/transaction.model';

export interface IProduct {
  id?: number;
  name?: string | null;
  price?: number | null;
  transaction?: ITransaction | null;
}

export const defaultValue: Readonly<IProduct> = {};
