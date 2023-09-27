export interface IClient {
  id?: number;
  name?: string | null;
  age?: number | null;
}

export const defaultValue: Readonly<IClient> = {};
