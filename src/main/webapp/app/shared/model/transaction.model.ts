import dayjs from 'dayjs';
import { IClient } from 'app/shared/model/client.model';

export interface ITransaction {
  id?: number;
  day?: string | null;
  client?: IClient | null;
}

export const defaultValue: Readonly<ITransaction> = {};
