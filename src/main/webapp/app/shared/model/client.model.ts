import { IUser } from 'app/shared/model/user.model';

export interface IClient {
  id?: number;
  name?: string | null;
  age?: number | null;
  user?: IUser | null;
}

export const defaultValue: Readonly<IClient> = {};
