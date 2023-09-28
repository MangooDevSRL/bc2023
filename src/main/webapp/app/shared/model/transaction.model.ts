import dayjs from 'dayjs';

export interface ITransaction {
  id?: number;
  day?: string | null;
}

export const defaultValue: Readonly<ITransaction> = {};
